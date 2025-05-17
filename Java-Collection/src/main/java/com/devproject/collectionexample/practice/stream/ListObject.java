package com.devproject.collectionexample.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employ {
    String name;
    Employ(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ListObject {
    public static void main(String[] args) {
        List<Employ> employ = Arrays.asList(new Employ("kiran"), new Employ("sunil"));

        List<String> output = employ.stream()
                .map(Employ::getName)
                .collect(Collectors.toList());

        output.forEach(System.out::println);
    }
}
