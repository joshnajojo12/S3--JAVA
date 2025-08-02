// Author: Joshna Jojo
// Date: 18-07-2025

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i, num, flag = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to check if it is prime or not:");
        num = sc.nextInt();
        
        if (num <= 1) {
            System.out.println("It is not a prime number");
        } else {
            for (i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("It is not a prime number");
            } else {
                System.out.println("It is a prime number");
            }
        }

      
    }
}
