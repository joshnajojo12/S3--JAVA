// Author: Joshna Jojo
// Date: 25-07-2025
import java.util.Scanner;
public class oddNumber{
    public static void main(String[] args){
        int limit,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit :");
        limit=sc.nextInt();
        System.out.println("Odd numbers from 1 to " + limit + " are:");
        for( i=1;i<=limit;i++){
            if(i%2==0){
                continue;
               
            }
             System.out.println(i); 
        }

       


    }
}