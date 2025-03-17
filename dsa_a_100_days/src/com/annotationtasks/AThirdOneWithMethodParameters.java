package com.annotationtasks;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class AThirdOneWithMethodParameters {
    
    @MyAnno(str="Testing again again", val=102)
    public static void myMethod(String s, int i){
        AThirdOneWithMethodParameters atowmp = new AThirdOneWithMethodParameters();

        try{
            Class<?> c = atowmp.getClass();
            Method m = c.getMethod("myMethod", String.class, int.class);
            MyAnno annoo = m.getAnnotation(MyAnno.class);

            System.out.println(annoo.str() + " " + annoo.val());
        } catch(NoSuchMethodException e) {
            System.out.println("Exception occured.");
        }
    }

    public static void main(String[] args) {
        myMethod("Sagar", 69);
    }
}
