package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[] hiArray = { 'h' , 'i' , '.' };
        String hiString = new String(hiArray);
        System.out.println( hiString );

        String name = "jack";
        int length = name.length();
        System.out.println("number of letters :" + length);

        //concat example

        String firstName = "Chandrika";
        String lastName = "Dey";
        System.out.println("I am " + firstName + "." + "My last name is " + lastName + ".");

    }
}
