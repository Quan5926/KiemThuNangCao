package com.example.demo34.utils;

public class MathUtils {
    public static int sumArray(int[] arr){
        if(arr == null){
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int num : arr){
            sum += num;
        }
        return sum;
    }
}
