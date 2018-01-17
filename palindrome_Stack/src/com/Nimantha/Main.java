package com.Nimantha;
import java.util.Scanner;
import java.util.Stack;

// @author Nimantha Nadeeraka

public class Main {

    public static Scanner input = new Scanner(System.in);
    // use the Scanner to get user input

    public static void main(String[] args) {
        System.out.println("Enter the palindrome to check :\r");
        // to get user input
        Stack<Character> p_stack =new Stack<>();
        //define a char stack
        String user_input = input.nextLine();
        //get user input
        String Validate = user_input.toLowerCase().replaceAll("[^a-z]","");
        // check String using regular expression
        for(Character character: user_input.toCharArray())
            p_stack.push(character);
        String labal = "";
        while(p_stack.size()>0)
        {
            labal += p_stack.pop();
        }
        if (user_input.equals(labal))
        {
            System.out.println("\n");
            System.out.println(" YES It is a Palindrome");
            System.out.println("\n");
        }
        else
        {
            System.out.println("\n");
            System.out.println(" NOT It is NOT a Palindrome");
            System.out.println("\n");
        }


    }
}
