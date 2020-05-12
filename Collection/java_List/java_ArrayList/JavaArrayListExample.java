package com.company.collection_in_java.java_ArrayList;

import java.util.ArrayList;

public class JavaArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list1  = new ArrayList<>();
        list1.add("Dhabi");
        list1.add("Beijing");
        list1.add("Berlin");

        list1.remove(1);

        list1.forEach(System.out::println);
    }
}
