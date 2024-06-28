package org;
import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Give me number to validate: " );
        int num = teclado.nextInt();
        boolean isPrime = true;
        for(int i = 2; i<Math.sqrt(num); i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("The number is prime:  " + num);
        }else{
            System.out.println("The number not is prime: " + num);
        }
    }
}
