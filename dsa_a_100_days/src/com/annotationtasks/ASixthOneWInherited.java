package com.annotationtasks;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MyInherited {
    String value();
}

@MyInherited("Hello")
class SuperClass {

}

public class ASixthOneWInherited extends SuperClass {
    
    public static void myMethod() {
        ASixthOneWInherited asowi = new ASixthOneWInherited();
        
        Class<?> c = asowi.getClass();
        System.out.println("isAnnotationPresent in subclass: " + c.isAnnotationPresent(MyInherited.class));
    }

    public static void main(String[] args) {
        myMethod();
    }
}
