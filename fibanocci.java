// Author: Joshna Jojo
// Date: 19-07-2025

import java.util.Scanner;
public class fibanocci{
    public static void main(String[] args)
    {
        int a=0,b=1,limit,i=2,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        limit=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(i<limit)
        {
            c=a+b;
            
        System.out.println(c);
        a=b;
        b=c;
        i++;
        }
    }
}