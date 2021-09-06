/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Abel Thomas
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args){
        /*
        print a question asking user for the input string
        prompt input
        determine number of characters in input
        print number of characters
         */

        Scanner input = new Scanner (System.in);
        System.out.print("What is the input string? ");
        String inputString = input.next();

        int stringLength = inputString.length();

        System.out.println(inputString + " has " + stringLength + " characters.");

    }
}
