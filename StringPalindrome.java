//Author:Joshna Jojo
//Date:04/09/2025
import java.util.Scanner;
public class StringPalindrome{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i;
        System.out.println("enter the string");
        String str1=sc.nextLine().toLowerCase();
        
        String orginal="";
        int length=str1.length();
        for( i=0;i<length;i++)
        {
            char ch=str1.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                orginal+=ch;
            }
            
        }

        String rev="";
        for(i=orginal.length()-1;i>=0;i--)
        {
            rev=rev+orginal.charAt(i);
        }
       
        if(orginal.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}