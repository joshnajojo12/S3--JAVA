//Author:Joshna Jojo
//Date:03/09/2025
import java.util.Scanner;
public class reverseAstring{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        String rev="";
        int length=str.length();
        //System.out.println(length);
     for (int i=length-1;i>=0;i--)
     {
        rev=rev+str.charAt(i);
     }
     System.out.println(rev);
     

    }
}