package com.annotationtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class ASecondOneWMethod {
    
    @MyAnno(str="Testing again", val=101)
    public static void myMethod() {
        ASecondOneWMethod asowm = new ASecondOneWMethod();

        try{
            Class<?> c = asowm.getClass();
            Method m = c.getMethod("myMethod");
            MyAnno a1 = m.getAnnotation(MyAnno.class);

            System.out.println(a1.str() + " " + a1.val());
        }catch(NoSuchMethodException e) {
            System.out.println("Exception occured.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
