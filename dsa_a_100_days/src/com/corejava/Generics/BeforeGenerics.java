package com.corejava.Generics;

class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        System.out.println("Type of ob: " + ob.getClass().getName());
        return ob;
    }
}

public class BeforeGenerics {
    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);
        iOb.getOb();

        int v = (Integer) iOb.getOb(); // A cast is necessary
        System.out.println("value: " + v);

        System.out.println();

        NonGen strOb = new NonGen("Non-Gen test");
        strOb.getOb();

        String str = (String) strOb.getOb(); // A cast is necessary
        System.out.println("value: " + str);

        iOb = strOb;
        v = (Integer) iOb.getOb();  // Throws run-time error, which is really bad
    }
}
