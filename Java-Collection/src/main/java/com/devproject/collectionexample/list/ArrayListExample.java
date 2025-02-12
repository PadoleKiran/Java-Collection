package com.devproject.collectionexample.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add(20);
        l.add("kiran");

        System.out.println(l);

 //     l.remove(20);
        l.remove("kiran");
        System.out.println(l);

        l.clear();
        System.out.println(l);

        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l);

        System.out.println(l.get(1));

        l.add(2, 100);
        System.out.println(l);

        List l2 = new ArrayList<>();

        l2.add(1000);
        l2.add(2000);
        l2.add(3000);

        System.out.println(l2);

        l.addAll(l2);
        System.out.println(l);

        l.removeAll(l2);
        System.out.println(l);

        System.out.println(l.contains(20));
        System.out.println(l.indexOf(3));
        System.out.println(l.subList(0,2));
        System.out.println(l.isEmpty());

        Object[] arr = l.toArray();

        for (int i=0;i< args.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr);
    }
}
