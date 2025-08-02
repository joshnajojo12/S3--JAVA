// Author: Joshna Jojo
// Date: 25-07-2025

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if (ch >= 'a' && ch <= 'z')
                    System.out.println(ch + " is a consonant.");
                else
                    System.out.println("Invalid input. Please enter an alphabet character.");
        }

    
    }
}
