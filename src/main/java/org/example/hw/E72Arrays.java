package org.example.hw;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        /*
write a program that creates a String array with size 7.
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array
Example:
Please enter day 1 of the week
Sunday
 */
        Scanner input = new Scanner(System.in);
        String[] daysOfWeek = new String[7];

        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter day " + (i +1) + " of the week");
            daysOfWeek[i] = input.nextLine();
        }

        for (String day : daysOfWeek) {
            System.out.println(day);
        }

    }
}
