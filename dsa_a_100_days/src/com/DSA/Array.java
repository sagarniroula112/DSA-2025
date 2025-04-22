package com.DSA;

class Array {
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

    public void insert(int item) {
        // If array is full, make a new array with double of current size, copy them all and add that new item there.
        // If able to insert, then insert it at the end.

        if(items.length == count) {
            int[] newItems = new int[count*2];

            for(int i=0;i<count;i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        for(int i=index; i<count-1;i++) {
            items[i] = items[i+1];
        }
        count--;
    }

    public int indexOf(int item) {
        for(int i=0;i<count;i++) {
            if(items[i] == item) {
                return i;
            }
        }
        return -1;
    }

}
