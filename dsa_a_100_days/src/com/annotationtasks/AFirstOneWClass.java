package com.annotationtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@MyAnno(str="Testing", val=100)
public class AFirstOneWClass {
    public static void main(String[] args) {
        AFirstOneWClass ob = new AFirstOneWClass();
        Class<?> mainClass = ob.getClass();
        
        MyAnno anno = mainClass.getAnnotation(MyAnno.class);
        System.out.println(anno.str() + " " + anno.val());
    }
}
