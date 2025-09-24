package org.exercise;

import java.util.Map;
import java.util.stream.Collectors;

//write a program to generate the largest number possible using these digits
//input; arr[] = {8,6,0,4,6,4,2,7}
//output: 87664420
public class LargestNumber {
    //String letters = "aabcccbleebaaeeCCC";
    //
    public static void main(String[] args) {
        int numeros[] = {4,6,34,3,1,0};

        int size = numeros.length;
        int suma = 0;
        for (int i =0; i < size; i++){
            System.out.println(numeros[i]);
            suma = numeros[i] += 1 ;
            System.out.println(suma);
        }

    }





}
