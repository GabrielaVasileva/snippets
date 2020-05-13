package com.company.collection_in_java.java_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratingLinkedList {

    public static void main(String[] args) {
        List<String> ll = new LinkedList<>();
        ll.add("Earth");
        ll.add("Mars");
        ll.add("Venus");
//        For loop
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

//       Advanced For loop
        for (String s : ll) {
            System.out.println(s);
        }

//       Iterator
        Iterator iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//       While Loop
        int index = 0;
        while (ll.size() > index) {
            System.out.println(ll.get(index));
            index++;
        }
    }
}
