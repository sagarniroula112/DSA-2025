package com.DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for(int i=arr.length-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
        // for(int i=0;i<arr.length;i++) {
        //     for(int j=1;j<arr.length;j++) {
        //         if(arr[j-1] > arr[j]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j-1];
        //             arr[j-1] = temp;
        //         }
        //     }
        // }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,6,5,2,3};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
