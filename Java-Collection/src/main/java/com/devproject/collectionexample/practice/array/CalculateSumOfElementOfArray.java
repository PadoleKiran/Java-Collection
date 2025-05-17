package com.devproject.collectionexample.practice.array;

public class CalculateSumOfElementOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,8};
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
