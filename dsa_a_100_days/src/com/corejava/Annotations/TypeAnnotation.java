package com.corejava.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnno { }

@Target(ElementType.TYPE_USE)
@interface NotZeroLen { }

@Target(ElementType.TYPE_USE)
@interface Unique { }

@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What {
    String description();
}

@Target(ElementType.FIELD)
@interface EmptyOK { }

@Target(ElementType.METHOD)
@interface Recommended {}

public class TypeAnnotation<@What (description = "Generic data type") T> {
    
    // Use a type annotation on a constructor
    public @Unique TypeAnnotation() {}

    // Annotate the type (String), not the field
    @TypeAnno String str;

    // This annotates the field test.
    @EmptyOK String test;

    // Use a type annotation to annotate this (the receiver).
    public int f(@TypeAnno TypeAnnotation<T> this, int x) {
        return 10;
    }

    // Annotate the return type.
    public @TypeAnno Integer f2(int j, int k) {
        return j+k;
    }

    // Annotate the method declaration.
    public @Recommended Integer f3(String str) {
        return str.length() / 2;
    }

    // Use a type annotation with a throws clause.
    public void f4() throws @TypeAnno NullPointerException {
        // ...
    }

    // Annotate array levels.
    String @MaxLen(10) [] @NotZeroLen [] w;

    // Annotate the array element type.
    @TypeAnno Integer[] vec;

    public static void myMethod(int i) {

        // Use a type annotation on a type argument.
        TypeAnnotation<@TypeAnno Integer> ob = new TypeAnnotation<@TypeAnno Integer>();

        // Use a type annotation with new.
        @Unique TypeAnnotation<Integer> ob2 = new @Unique TypeAnnotation<Integer>();

        Object x = Integer.valueOf(10);
        Integer y;

        // Use a type annotation on a cast.
        y=(@TypeAnno Integer) x;
    }

    public static void main(String[] args) {
        myMethod(10);
    }
    // Use type annotation with inheritance clause.
    class SomeClass extends @TypeAnno TypeAnnotation<Boolean> {}
}
