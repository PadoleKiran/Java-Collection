package com.devproject.collectionexample.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("kiran","sunil","romil");
        List<String> str = li.stream()
                .filter(name -> name.startsWith("k"))
                .collect(Collectors.toList());

        str.forEach(System.out::println);
    }
}
