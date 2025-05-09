package com.DSA.HashTable;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }
}
