package com.devproject.collectionexample.practice.stream;

import java.util.Arrays;
import java.util.List;

public class SumUsingStream {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);

        int newArr = li.stream()
                .reduce(0, Integer::sum);

        System.out.println(newArr);
    }
}
