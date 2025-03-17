package com.annotationtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str() default "Testing 123";
    int val() default 123;
}

public class AFifthOneWDefaultValues {
    
    @MyAnno3()
    public static void myMethod() {
        AFifthOneWDefaultValues afowdv = new AFifthOneWDefaultValues();
        try {
            Class<?> c = afowdv.getClass();
            Method m = c.getMethod("myMethod");
            MyAnno3 anno3 = m.getAnnotation(MyAnno3.class);

            System.out.println(anno3);
        } catch(NoSuchMethodException e) {
            System.out.println("Exception occured.");
        }
    }

    public static void main(String[] args) {
        myMethod();
    }
}
