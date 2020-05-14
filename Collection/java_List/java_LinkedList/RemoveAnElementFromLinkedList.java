package com.company.collection_in_java.java_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class RemoveAnElementFromLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list=new LinkedList<String>();

        //Adding elements to the Linked list
        list.add("Mercury");
        list.add("Venus");
        list.add("Earth");
        list.add("Mars");
        list.add("Jupiter");

        //Removing First element
        //Same as list.remove(0);
        list.removeFirst();

        //Removing Last element
        list.removeLast();

        //Iterating LinkedList
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        //removing 2nd element, index starts with 0
        list.remove(1);

        //Iterating LinkedList again
        Iterator<String> iterator2=list.iterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+" ");
        }
    }
}
