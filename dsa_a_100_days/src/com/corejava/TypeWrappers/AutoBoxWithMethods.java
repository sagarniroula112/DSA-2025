package com.corejava.TypeWrappers;

public class AutoBoxWithMethods {
    static int m(Integer v) {
        return v; // auto-unboxed to int
    }

    public static void main(String[] args) {
        Integer ino = m(100); // autoboxed to Integer
        System.out.println(ino);
    }
}
