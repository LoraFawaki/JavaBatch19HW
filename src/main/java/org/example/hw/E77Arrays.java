package org.example.hw;

public class E77Arrays {
    public static void main(String[] args) {

        //write code from here
/*
        Write a program that prints the highest value in the array.

                **Expected Output:**
        input [5,4,8]
*/
        int [] num={5, 4 , 8};
        int max=num[0];

        for (int n:num){
            if (max<n){
                max=n;
            }
        }
        System.out.print(max);

    }
}
