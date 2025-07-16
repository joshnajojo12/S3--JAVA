import java.util.Scanner;
public class largestNUmber{
    public static void main(String[] args)
    {
        int num1,num2,num3,largest;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the 3 numbers");
    num1=sc.nextInt();
    num2=sc.nextInt();
    num3=sc.nextInt();
    if((num1>num2) && (num1>num3)){
        largest=num1;
    }
    else if((num2>num1) && (num2>num3)){
        largest=num2;
    }
    else{
        largest=num3;
    }
    System.out.println("the largest number is"+ largest);
        
    }
}