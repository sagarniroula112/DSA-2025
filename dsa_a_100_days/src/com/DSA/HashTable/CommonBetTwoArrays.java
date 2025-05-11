package com.DSA.HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonBetTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4};
        int[] nums2 = {3,4,5,6};

        System.out.println(findIntersectionValues(nums1, nums2));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        ArrayList<Integer> common = new ArrayList<>();
    
        for (int i : nums1) {
            myHashMap.put(i, true);
        }
    
        for (int j : nums2) {
            if (myHashMap.get(j) != null) {
                common.add(j);
            }
        }
    
        int[] comm = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            comm[i] = common.get(i);  // unboxing Integer to int
        }
    
        return comm;
    }
    
}
