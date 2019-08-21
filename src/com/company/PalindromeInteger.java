package com.company;

// create a class
public class PalindromeInteger {

// create a method
    public static void main(String[] args) {

// declare input and other necessities
        int inp = 4554;
        int rem, run = 0, org;

// set input equal to original to allow input to be iterated
// while preserving original for comparison later
        org = inp;

// create a while loop to iterate the input
        while (inp >0) {
// modulus pulls last integer out of the inp
            rem = inp % 10;
// multiplying run by 10 adds a tenth space (0) at the end to allow the addition of the rem
            run = (run * 10) + rem;
// dividing inp by 10 removes the last integer off of the inp
            inp = inp / 10;
        }

// compare using conditional statement for final result
        if(org == run)
            System.out.println(org + " is a Palindrome");
        else
            System.out.println(org + "is not a Palindrome");
    }
}
