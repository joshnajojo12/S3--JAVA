// Author: Joshna Jojo
// Date: 25-07-2025

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci numbers to print (n): ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

    
    }
}
