package com.devproject.collectionexample.practice;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] a = {3, 100, 95, 78, 20, 1, 0};
        int n = a.length;
        for(int i=0;i<n-1;i++) {
            for (int j = 0;j<n-1-i;j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array : ");
        for (int i=0;i<n;i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Second Largest number : " + a[1]);
        System.out.println("Second Smallest number : " + a[n-2]);
    }
}
