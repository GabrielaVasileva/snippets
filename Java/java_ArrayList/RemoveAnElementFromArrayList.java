package com.company.collection_in_java.java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveAnElementFromArrayList {
    public static void main(String[] args) {

        //ex.1
        List<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(1);
        al1.add(2);

        // This makes a call to remove(int) and
        // removes element 20.
        al1.remove(1);

        // Now element 30 is moved one position back
        // So element 30 is removed this time
        al1.remove(1);

        System.out.println("Modified ArrayList : " + al1);

        //ex.2
        List<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(1);
        al2.add(2);

        // Remove elements smaller than 10 using
        // Iterator.remove()
        Iterator itr = al2.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x < 10)
                itr.remove();
        }

        System.out.println("Modified ArrayList : "
                + al2);

        //ex.3
        List<Integer> al3 = new ArrayList<>();
        al3.add(10);
        al3.add(20);
        al3.add(30);
        al3.add(1);
        al3.add(2);

        //This makes a call to remove(Object) and
        // removes element 1
        al3.remove(Integer.valueOf(1));

        // This makes a call to remove(Object) and
        // removes element 2
        al3.remove(Integer.valueOf(2));

        System.out.println("Modified ArrayList : " + al3);


    }
}
