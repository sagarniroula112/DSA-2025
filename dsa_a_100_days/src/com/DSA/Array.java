package com.DSA;

public class Array {
    // Arrays store data sequentially in memory. So lookup is simple and always O(1), insertion and deletion is O(n) in worst cases.

    // We need to make sure our array is dynamic and can accept data when full.

    private int[] items;
    private int count = 0;

    Array(int n) {
        this.items = new int[n];
    }

    public void printItems() {
        if(count == 0) {
            System.out.println("No items to print.");
        }

        for(int i=0;i<count;i++) {
            System.out.println(items[i]);
        }
    }

    

}
