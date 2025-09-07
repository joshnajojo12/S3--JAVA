//Author:Joshna jojo
//Date:04/09/2025
import java.util.Scanner;
public class ReplaceString{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
          System.out.println("Enter the character to be replaced");
          char oldChar=sc.nextLine().charAt(0);
          System.out.println("Enter the new character");
          char newChar=sc.nextLine().charAt(0);
          int length=str.length();
          String result="";
          for(int i=0;i<length;i++)
          {
            char ch=str.charAt(i);
            if(ch== oldChar)
            result+=newChar;
            else
            result+=ch;

          }
          System.out.println("Result:"+result);

    }
}