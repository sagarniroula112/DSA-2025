package com.corejava.TypeWrappers;

public class CharacterWrapper {
    public static void main(String[] args) {
        // Character c1 = new Character('A'); // DEPRECATED

        Character ch1 = Character.valueOf('B'); // static method (latest)
        // OR (Both are same)
        Character ch2 = 'B';
        System.out.println(ch1 + " " + ch2);
        System.out.println(Character.toLowerCase(ch2));

        char ch3 = 'C';
        System.out.println(Character.toLowerCase(ch3));
    }    
}
