/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
package org.example;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("What is the quote? ");
        String q = input.nextLine();
        System.out.println("Who said it? ");
        String a = input.nextLine();
        System.out.println( a + " says, " + '"' + q + '"');
    }
}
