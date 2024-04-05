package org.example.hw;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            //  System.out.println("Please enter a number");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i <= numbers.length ; i++) {
            System.out.println(i*10);

        }

    }
}
