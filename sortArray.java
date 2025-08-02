// Author: Joshna Jojo
// Date: 25-07-2025
import java.util.Scanner;
public class sortArray {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        n = sc.nextInt();
        int[] num = new int[n];
        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // Bubble Sort
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    
    }
}