package com.annotationtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1 {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    String desc();
}


@MyAnnotation1(str="First annotation for class", val=100)
@MyAnnotation2(desc="Second annotation for class")
public class AFourthOneWithAllAnnotations {
    
    @MyAnnotation1(str="First annotation for method", val=101)
    @MyAnnotation2(desc="Second annotation for method")
    public static void myMethod(String s, int i) {
        AFourthOneWithAllAnnotations afowaa = new AFourthOneWithAllAnnotations();

        try{
            Class<?> c = afowaa.getClass();
            Method m = c.getMethod("myMethod", String.class, int.class);

            System.out.println("********* CLASS KO ANNOTATIONS! *********");

            Annotation[] annos = c.getAnnotations();
            for(Annotation a : annos) {
                System.out.println(a);
            }

            System.out.println("********* METHOD KO ANNOTATIONS! *********");

            annos = m.getAnnotations();
            for(Annotation a : annos) {
                System.out.println(a);
            }
        } catch(NoSuchMethodException e) {
            System.out.println("Exception occured.");
        }
    }

    public static void main(String[] args) {
        myMethod("Sagar", 69);
    }
}
