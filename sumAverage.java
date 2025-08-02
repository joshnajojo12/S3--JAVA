
import java.util.Scanner;
public class sumAverage {
    public static void main(String[] args) {
        int n,sum=0,i;
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the limit:");
        n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Array length = " + numbers.length);

        System.out.println("Enter the array elements:");
        for (i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
         for ( i = 0; i < n; i++){
            sum=sum+numbers[i];
         }
         int average=(sum/i);
         System.out.println("the sum is :"+sum);
          System.out.println("the average is :"+average);

    }}