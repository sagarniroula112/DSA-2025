package com.DSA.Stacks;

public class Array {
    int[] items;
    int count;

    public Array(int n) {
        items = new int[n];
        count = 0;
    }

    public void printItems() {
        for(int i=0;i<count;i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int value) {
        if(count == items.length) {
            int[] newItems = new int[count*2];
            for(int i=0;i<count;i++) {
                newItems[i] = items[i];
            }
            items = newItems;            
        }
        items[count] = value;
        count++;
    }

    public int removeAt(int index) {
        if(index < 0 || index >= count) {
            return -1;
        } else {
            int toRemove = items[index];
            for(int i=index;i<count-1;i++) {
                items[i] = items[i+1]; 
            }
            count--;
            return toRemove;
        }
    }

    public int indexOf(int value) {
        for(int i=0;i<count;i++) {
            if(items[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
