package com.devproject.collectionexample.practice.array;

public class FindSmallAndLargeNumber {
    public static void main(String[] args) {
        int arr[] = {55,4,6,88,6,3,5};
        int LargestNumber = arr[0];
        int SmallNumber = arr[0];

//        for (int i =0;i<arr.length;i++) {
//            if (arr[i] >= LargestNumber) {
//                LargestNumber = arr[i];
//            }
//            if (arr[i] >= SmallNumber) {
//                SmallNumber = arr[i];
//            }
//        }

        for (int i =0;i<arr.length;i++) {
            if (LargestNumber < arr[i]) {
                LargestNumber = arr[i];
            }

            if (SmallNumber > arr[i]) {
                SmallNumber = arr[i];
            }
        }

        System.out.println("Larger number is " + LargestNumber);
        System.out.println("Smaller number is " + SmallNumber);
    }
}
