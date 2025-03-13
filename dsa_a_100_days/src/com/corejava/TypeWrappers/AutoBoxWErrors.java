package com.corejava.TypeWrappers;

public class AutoBoxWErrors {
    public static void main(String[] args) {
        Integer ino = 1000;
        int i = ino.byteValue();
        System.out.println(i);
    }
}
