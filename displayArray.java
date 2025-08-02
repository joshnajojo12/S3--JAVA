import java.util.Scanner;
public class displayArray{
    public static void main(String[] args)
    {
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
n=sc.nextInt();
int[]num=new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;i++){
num[i]=sc.nextInt();
    }
    System.out.println("the elements in same order is");
for(int i=0;i<n;i++){
System.out.println(num[i]);
    }
    System.out.println(" the elements in the reversed order is");
for(int i=n-1;i>=0;i--){
    
System.out.println(num[i]);
    }
}
}