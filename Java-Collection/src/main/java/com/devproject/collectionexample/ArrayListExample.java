package com.devproject.collectionexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add(20);
        l.add("kiran");

        System.out.println(l);

 //        l.remove(20);
        l.remove("kiran");

        System.out.println(l);
    }
}
