package com.DSA.Stacks;

public class StackWArray {
    int[] items;
    int count;

    public StackWArray(int n) {
        items = new int[n];
        count = 0;
    }

    public void printItems() {
        for(int i=0;i<count;i++) {
            System.out.println(items[i]);
        }
    }
}
