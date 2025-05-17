package com.devproject.collectionexample.practice.array;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        if (n<=1) {
            for (int i = 1; i == n; i++) {
                sum += i;
            }
        }
        else {
            System.out.println("please enter number greater than 0 your number is " + n);
        }
    }
}
