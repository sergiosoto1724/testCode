package org.exercise;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Write the word: ");
    String str = teclado.next();
    if(IsParlindrome(str)){
        System.out.println("\"" + str + "\" Is a palindrome." );
    } else {
        System.out.println("\"" + str + "\" Is not a palindrome." );
    }

    }
    public static boolean IsParlindrome(String str){
       /* int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true; */
        return str.equals( new StringBuilder(str).reverse().toString());


    }

}
