import java.util.Scanner;
public class oddEvenInArray{
    public static void main(String[] args)
    {
        int n,odd=0,even=0,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("enter the elements");
        for( i=0;i<n;i++)
        {
            num[i]=sc.nextInt();

        }
     for(i=0;i<n;i++)
     {
        if(num[i]%2==0)
        {
            even++;
        }
        else{
            odd++;
        }
     }
     System.out.println("the count of odd number is:"+odd);
      System.out.println("the count of even number is:"+even);
    }
}