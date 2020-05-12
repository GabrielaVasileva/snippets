package com.company.collection_in_java.java_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Stream.of;

public class InitializationOfAnArrayList {
    public static void main(String[] args) {

//        The traditional way to create and initialize an ArrayList is:
        List<String> planets1 = new ArrayList<>();
        planets1.add("Earth");
        planets1.add("Mars");
        planets1.add("Venus");

//        Method 1: Creating a singleton list
//        Creates an immutable list containing only the specified object. The returned list is serializable.
        List<String> planets2 = Collections.singletonList("Earth");

//
//        Method 2a: Creating and initialize a list in one line
//        Creates a fixed-size list backed by the specified array.
//        This method acts as bridge between array-based and collection-based APIs,
//        in combination with Collection.toArray(). The returned list is serializable
//        and implements RandomAccess. This method also provides a convenient way
//        to create a fixed-size list initialized to contain several elements:
        List<String> planets3 = Arrays.asList("Earth", "Mars", "Venus");

//        Method 2b: Creating and initialize a list in one line and static import
//        We can statically import the asList()
//        import static java.util.Arrays.asList;
        List<String> planets4 = asList("Earth", "Mars", "Venus");

//        Method 3a: Create and initialize an arraylist in one line
//        Constructs a list containing the elements of the specified collection, in the order they are returned by the collection’s iterator.
        List<String> planets5 = new ArrayList<String>(Arrays.asList("Earth", "Mars", "Venus"));

//        Method 3b: Create and initialize an arraylist in one line and static import
//        We can statically import the asList()
//
//import static java.util.Arrays.asList;
        List<String> planets6 = new ArrayList<String>(asList("Earth", "Mars", "Venus"));

//        Method 3b: Create and initialize an arraylist in one line and static import
//        We can statically import the asList()
//
//import static java.util.Arrays.asList;
        List<String> planets7 = new ArrayList<String>(asList("Earth", "Mars", "Venus"));

//        Method 5a: Create and initialize a list using Java 8
//        Stream.of() returns a sequential ordered stream whose elements
//        are the specified values. Collectors.toList() returns a Collector
//        that accumulates the input elements into a new List. There are no
//        guarantees on the type, mutability, serializability, or thread-safety
//        of the List returned; if more control over the returned List is
//        required, use toCollection(Supplier).

        List<String> planets8 = Stream
                .of("Earth", "Mars", "Venus")
                .collect(toList());

//        Method 5b: Create and initialize an arraylist using Java 8
//        Stream.of() returns a sequential ordered stream whose elements are the
//        specified values. Collectors.toCollection() returns a Collector that
//        accumulates the input elements into a new Collection, in encounter order.
//        The Collection is created by the provided factory.
        ArrayList<String> planets9 = Stream
                .of("Earth", "Mars", "Venus")
                .collect(toCollection(ArrayList::new));

//        Method 6a: Create and initialize a list using Java 8 static import
//        We can statically import the of() and toList() methods.
//
//import static java.util.stream.Stream.of;
//import static java.util.stream.Collectors.toList;
        List<String> planets10 = of("Earth", "Mars", "Venus").collect(toList());

//        Method 7b: Create and initialize an arraylist using Java 8 static import
//        We can statically import the of() and toCollection() methods.
//
//import static java.util.stream.Stream.of;
//import static java.util.stream.Collectors.toCollection;
        ArrayList<String> planets11 = of("Earth", "Mars", "Venus").collect(toCollection(ArrayList::new));
    }
}
