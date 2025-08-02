import java.util.Scanner;
public class ternary{
    public static void main(String[] args)
    {
        int firstNumber,secoundNumber,biggNumber;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        firstNumber=sc.nextInt();
        System.out.println("enter the secound number");
        secoundNumber=sc.nextInt();
        biggNumber= firstNumber>secoundNumber?firstNumber:secoundNumber;
        System.out.println("the bigg number is"+biggNumber);

    }
}