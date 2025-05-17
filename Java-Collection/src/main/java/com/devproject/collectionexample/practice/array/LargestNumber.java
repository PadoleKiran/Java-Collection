package com.devproject.collectionexample.practice.array;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {5,4,9,3,7,1,0};
        int l = arr[0];
        for(int i=0; i<arr.length;i++){
            if (arr[i]>l) {
                l = arr[i];
            }
        }

        System.out.println("Largest number is " + l);
    }
}
