package com.company.collection_in_java.java_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElementToLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Earth");
        list.add("Mars");
        list.add("Venus");

        //Adding an element to the first position
        list.addFirst("Mercury");

        //Adding an element to the last position
        list.addLast("Neptune");

        //Adding an element to the 3rd position
        list.add(2, "Uranus");

        //Iterating LinkedList
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
