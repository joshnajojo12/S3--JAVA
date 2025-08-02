
//Author:Joshna Jojo
//Date :31-7-2025
import java.util.Scanner;
public class Calculator{
public static void main(String[] args)
{
    String choice;
    double result=0;
    Scanner sc=new Scanner(System.in);
    do
    {
        
int n;
double n1,n2;
System.out.println("Enter1 for add,2 for substraction,3 for multiplication,4 for division");
n=sc.nextInt();
System.out.println("Enter the two numbers");
n1=sc.nextInt();
n2=sc.nextInt();
Calculate c1=new Calculate(n1,n2);

switch(n)
{
case 1:
result=c1.add();
break;
case 2:
result=c1.substraction();
break;
case 3:
result=c1.multiplication();
break;
case 4:
result=c1.division();
break;
default:
System.out.println("invalid");
}
System.out.println(result);
        System.out.println("Do you want to continue y/n");
        choice =sc.next();
    }while(choice.equalsIgnoreCase("y"));
System.out.println("thankyou for using calculator");
}
}
class Calculate{
    double number1,number2;
Calculate(double num1, double num2)
    {
        number1 = num1;
        number2 = num2;

    }
    double add(){
        return number1+number2;
    }
       double substraction(){
        return number1-number2;
    }
       double division(){
        return number1/number2;
    }
       double multiplication(){
        return number1*number2;
    }
}