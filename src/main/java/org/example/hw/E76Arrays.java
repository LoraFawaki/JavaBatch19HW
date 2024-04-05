package org.example.hw;

public class E76Arrays {
    public static void main(String[] args) {
        //please write code from here
        double[][] a = {
                {1.4,2.0,3.3,2},
                {4,1.5,6.1,1},
                {1.2,3.1,4,1.6}
        };
        //write code from here
        // Write a program to double the values of every element in the array and print it out.

        for (int i=0; i<3;i++){
            for (int j=0; j<4;j++){
                a[i][j] *= 2;
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a [i][j] + " ");

            }
            System.out.println();
        }
    }
}
