// package com.corejava.Annotations;

// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.reflect.Method;

// @Retention(RetentionPolicy.RUNTIME)
// @interface MyAnno {
//     String str();
//     int val();
// }

// public class SecondReflection {
    
//     @MyAnno(str="Two parameters", val=100)
//     public static void myMethod(String str, int i) {
//         try {
//             SecondReflection sr = new SecondReflection();
//             Class<?> c = sr.getClass(); // Getting class object
//             System.out.println(c); // gives: class com.corejava.Annotations.SecondReflection

//             Method m = c.getMethod("myMethod", String.class, int.class);

//             MyAnno anno = m.getAnnotation(MyAnno.class);

//             System.out.println(anno.str()+ " " +anno.val());
            
//         }catch(NoSuchMethodException e) {
//             System.out.println("Exception occured.");
//         }
//     }

//     public static void main(String[] args) {
//         myMethod("Hello", 101);
//     }
// }
