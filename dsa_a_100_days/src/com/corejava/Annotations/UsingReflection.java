// package com.corejava.Annotations;

// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.reflect.Method;

// @Retention(RetentionPolicy.RUNTIME)
// @interface MyAnno {
//     String str();
//     int val();
// }

// public class UsingReflection {

//     @MyAnno(str="Annotation Example", val = 100)
//     public static void myMethod() {
//         UsingReflection ob = new UsingReflection();

//         try {
//             // First, get a Class object that represents this class.
//             Class<?> c = ob.getClass();
//             System.out.println(c);

//             // Second, get a Method object that represents this method.
//             Method m = c.getMethod("myMethod");

//             // Third, get the annotation for this class.
//             MyAnno anno = m.getAnnotation(MyAnno.class);

//             // Finally, display the values.
//             System.out.println(anno.str() + " " + anno.val());

//         }catch(NoSuchMethodException e) {
//             System.out.println("Method not found.");
//         }

//     }

//     public static void main(String[] args) {
//         myMethod();
//     }
// }
