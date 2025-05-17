package com.devproject.collectionexample.practice.array;

public class SmallestNumber {
    public static void main(String[] args) {
        int arr[] = {5,4,9,1,3,7,2};
        int l = arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]<l) {
                l = arr[i];
            }
        }

        System.out.println("Smallest number is " + l);
    }
}
