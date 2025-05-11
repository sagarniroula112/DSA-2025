package com.DSA.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable myHT = new HashTable();

        myHT.set("sagar", 23);
        myHT.set("apex", 69);
        myHT.set("nova", 42);
        myHT.set("lunar", 88);
        myHT.set("echo", 31);
        myHT.set("zeal", 57);
        myHT.set("orbit", 76);
        myHT.set("pixel", 14);
        myHT.set("quantum", 95);
        myHT.set("vertex", 63);

        myHT.printTable();

        System.out.println(myHT.get("quantum"));
        System.out.println(myHT.get("hari"));
        System.out.println(myHT.get("orbit"));
        System.out.println(myHT.get("zeal"));
        System.out.println("----------------------------------");
        System.out.println(myHT.keys());
    }
}
