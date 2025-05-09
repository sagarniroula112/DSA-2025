package com.DSA.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        // System.out.println(bst.root.left.value);
        System.out.println(bst.root.right.value);
        System.out.println(bst.root.right.right.value);

        System.out.println(bst.contains(27));
        System.out.println(bst.contains(17));
    }
}
