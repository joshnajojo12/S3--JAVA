import java.util.Scanner;
public class primeNumbers{
    public static void main(String[] args)
    {
        int i,num,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check if it is prime or not");
        num=sc.nextInt();
        for(i=2;i<num;i++)
         {
            if(num%i==0){
             flag=1;
         }
        
    }
    if(flag==1)
    {
        System.out.println("it is not prime");
    }
    else{
           System.out.println("it is prime");
    }
}
}