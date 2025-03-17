package com.annotationtasks;

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

            // Check class annotations
            System.out.println("isAnnotationPresent (MyAnnotation1 on class): " + c.isAnnotationPresent(MyAnnotation1.class));
            System.out.println("isAnnotationPresent (MyAnnotation2 on class): " + c.isAnnotationPresent(MyAnnotation2.class));

            Annotation[] annos = c.getAnnotations();
            for(Annotation a : annos) {
                System.out.println(a);
            }

            // Using getDeclaredAnnotations() to get only declared annotations (not inherited)
            System.out.println("Using getDeclaredAnnotations():");
            Annotation[] classDeclaredAnnos = c.getDeclaredAnnotations();
            for (Annotation a : classDeclaredAnnos) {
                System.out.println(a);
            }

            System.out.println("********* METHOD KO ANNOTATIONS! *********");

            annos = m.getAnnotations();
            for(Annotation a : annos) {
                System.out.println(a);
            }

            // Using getDeclaredAnnotations() to get only declared annotations on the method
            System.out.println("Using getDeclaredAnnotations():");
            Annotation[] methodDeclaredAnnos = m.getDeclaredAnnotations();
            for (Annotation a : methodDeclaredAnnos) {
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
