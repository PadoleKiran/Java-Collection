package com.devproject.collectionexample.practice.array;

public class FindNumber {
    public static void main(String[] args) {
        int a[] = {5,6,7,2,44,33,51,8};
        int n = 7;
        for (int i=0;i<a.length;i++){
            if (i == n){
                System.out.println(n + " is present in array at " + (i+1) + " position");
            }
        }
    }
}
