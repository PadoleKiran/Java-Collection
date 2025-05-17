package com.devproject.collectionexample.practice.array;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();

        if (n%2 ==0) {
            System.out.println(n + " Number is Even");
        }else {
            System.out.println(n + " Number is Odd");
        }

    }
}
