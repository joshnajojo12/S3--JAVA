import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[] args)
    {
        int number,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        number=sc.nextInt();
        int num=number;
        while(num>0)
        {
        sum = sum + (num % 10);
        num=num/10;
        }
         System.out.println("sum is:"+sum);
      
    }
}