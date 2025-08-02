// Author: Joshna Jojo
// Date: 17-07-2025
import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=sc.nextInt();
        int fact=1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.println("the factorial is "+fact);
    }
}