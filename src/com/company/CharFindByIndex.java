package com.company;

import java.util.stream.IntStream;

// class
public class CharFindByIndex {

// method
    public static void main(String[] args) {

// declare String
        String text = "find your foo";

// use char and charAt() to find character by index location
        char z = text.charAt(8);

// use boolean and contains("") to verify character exists or not
        boolean x = text.contains("r");

// print results
        // prints character at specified index location
        System.out.println(z);
        // prints true or false depending if character exists
        System.out.println(x);
    }
}
