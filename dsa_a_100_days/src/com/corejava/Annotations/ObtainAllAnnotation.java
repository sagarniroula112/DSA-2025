package com.corejava.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.*;

// Use: getAnnotations()

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description="An annotation test class.")
@MyAnno(str="Meta2", val=99)
public class ObtainAllAnnotation {

    @What(description="An annotation test method.")
    @MyAnno(str="Testing", val=100)
    public static void myMethod() {

        ObtainAllAnnotation oaa = new ObtainAllAnnotation();

        try {
            Annotation[] annos = oaa.getClass().getAnnotations();

            // Display all annotations for ObtainAllAnnotation class.
            for(Annotation a : annos) {
                System.out.println(a);
            }

            // Display all annotations for myMethod method.
            Method m = oaa.getClass().getMethod("myMethod");
            annos = m.getAnnotations();

            for(Annotation a1 : annos) {
                System.out.println(a1);
            }

        } catch(NoSuchMethodException e) {
            System.out.println("Exception occured.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
