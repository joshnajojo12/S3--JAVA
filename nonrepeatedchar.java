//Author:Joshna Jojo
//Date:04/09/2025
import java.util.Scanner;
public class nonrepeatedchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        int length = str.length();
        int[] counts = new int[256]; 

       
        for (int i = 0; i < length; i++) {
            counts[str.charAt(i)]++;
        }

    
        for (int i = 0; i < length; i++) {
            if (counts[str.charAt(i)] == 1) {
                System.out.println("First non-repeated character is: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeated character found.");
    }
}
