package com.company.collection_in_java.java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class IteratingArrayList {
    public static void main(String[] args) {

//     1.   By Iterator interface.
//     2.   By for-each loop.
//     3.   By ListIterator interface.
//     4.   By for loop.
//     5.   By forEach() method.
//     6.   By While Loop
//     7.   By forEachRemaining() method.

        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(14);
        arrlist.add(7);
        arrlist.add(39);
        arrlist.add(40);

//        Looping Array List using Iterator
        System.out.println("Iterator");
        Iterator iter = arrlist.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

         /*Advanced For Loop*/
        System.out.println("Advanced For Loop");
        for (Integer num : arrlist) {
            System.out.println(num);
        }

        /*ListIterator interface*/
        ListIterator<Integer> listIterator = arrlist.listIterator();
        System.out.println("Forward iteration");

//Forward iterator
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + ",");
        }

        System.out.println("Backward iteration");

//Backward iterator
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + ",");
        }

        System.out.println("Iteration from specified position");

//Start iterating from index 2
        listIterator = arrlist.listIterator(2);

        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + ",");
        }

        /* For Loop for iterating ArrayList */
        System.out.println("For Loop");
        for (int counter = 0; counter < arrlist.size(); counter++) {
            System.out.println(arrlist.get(counter));
        }

        /* While Loop for iterating ArrayList*/
        System.out.println("While Loop");
        int count = 0;
        while (arrlist.size() > count) {
            System.out.println(arrlist.get(count));
            count++;
        }

//        forEachRemaining() method
//        The forEachRemaining() method of Java Interface Spliterator
//        is used to performs the given action for each remaining element
//        sequentially in the current thread until all elements have
//        been processed or the action throws an exception.
//  import java.util.stream.Stream;
        Spliterator<Integer> numSpliterator = arrlist.spliterator();
        numSpliterator.tryAdvance(System.out::println);
        numSpliterator.forEachRemaining(System.out::println);

    }
}
