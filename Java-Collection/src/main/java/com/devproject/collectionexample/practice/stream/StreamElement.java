package com.devproject.collectionexample.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamElement {
    public static void main(String[] args) {
        List<String> StreamElement = Arrays.asList("kiran","sunil","akash","romil","kunal");

        List<String> streamList = StreamElement.stream()
//                .filter(name -> name.equalsIgnoreCase("kunal"))
//                .filter(name -> name.matches("Kunal"))
                .map(name -> name + " sir")
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        streamList.forEach(System.out::println);
    }
}
