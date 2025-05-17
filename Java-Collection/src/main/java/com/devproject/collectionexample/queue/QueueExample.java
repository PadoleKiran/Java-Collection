package com.devproject.collectionexample.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QueueExample {
    public static void main(String[] args) {
        Runnable a = () -> System.out.println("abc");

        System.out.println();

        List<String> names = Arrays.asList("John", "Alice", "Bob");

        // Sorting using lambda
        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println(names);
    }
}
