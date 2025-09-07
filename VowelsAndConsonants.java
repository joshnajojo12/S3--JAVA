import java.util.Scanner;
public class VowelsAndConsonants{
    public static void main(String[] args)
    {
        int  vowels=0;
        int consanants=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine().toLowerCase();
        int length=str.length();
        for(int i=0;i<length;i++)
        {
            char ch=str.charAt(i);
        
        if(Character.isLetter(ch))
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consanants++;
            }
        }}
    System.out.println("no.of vowels:"+vowels);
    System.out.println("no.of consanant:"+consanants);


    }
}