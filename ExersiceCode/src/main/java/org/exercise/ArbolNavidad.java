package org.exercise;

import java.util.Scanner;

public class ArbolNavidad {
    public static void main(String[] args) {
        int i,j,k,n;
        n=10;
        // Parte superior (follaje del pino)
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");
            }
            for (k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
