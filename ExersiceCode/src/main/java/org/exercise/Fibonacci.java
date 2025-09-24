package org.exercise;

import java.util.Scanner;

public class Fibonacci {
    public static void fibonaci (int Max) {
        int firstNum = 0;
        int secondNum = 1;
        int fibonacci = '\0';

        System.out.println(firstNum+ " ");
        System.out.println(secondNum + " ");
        for(int i=2; i < Max; i++){
            fibonacci = firstNum + secondNum;
            System.out.println(fibonacci + " ");

            firstNum = secondNum;
            secondNum = fibonacci;
        }
    }
    public static void main(String[] args) {
        System.out.println("Start Fibonacci ");
        Scanner number = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int Max = number.nextInt();
        fibonaci(Max);
    }
}

