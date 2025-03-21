package com.corejava.Generics;

class TwoGen<T, V> {
    T value1;
    V value2;

    TwoGen(T v1, V v2) {
        this.value1 = v1;
        this.value2 = v2;
    }

    void showTypes() {
        System.out.println("Type of T:: " + value1.getClass().getName());
        System.out.println("Type of V:: " + value2.getClass().getName());
    }

    T getValue1() {
        return this.value1;
    }

    V getValue2() {
        return this.value2;
    }
}

public class GenWTwoTypes {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();

        int v = tgObj.getValue1();
        System.out.println("value: " + v);

        String str = tgObj.getValue2();
        System.out.println("value: " + str);
    }
}
