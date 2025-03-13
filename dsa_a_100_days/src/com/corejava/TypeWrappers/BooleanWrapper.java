package com.corejava.TypeWrappers;

public class BooleanWrapper {
    public static void main(String[] args) {
        Boolean setState = Boolean.valueOf(true);
        System.out.println(setState);

        Boolean state2 = Boolean.valueOf("true");
        System.out.println(state2);

        Boolean state3 = Boolean.valueOf("FAlse");
        System.out.println(state3);

        // boolean state4 = "FAlse"; // WRONG
        boolean state4 = false;
        System.out.println(state4);

        System.out.println(state2.booleanValue());
        // System.out.println(state4.booleanValue()); // can't be called from primitive type boolean
    }
}
