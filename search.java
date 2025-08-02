import java.util.Scanner;
public class search{
    public static void main(String[] args)
    {
          int n,key,i,pos=-1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("enter the elements");
        for( i=0;i<n;i++)
        {
            num[i]=sc.nextInt();

        }
        System.out.println("enter the elemnt to be searched");
        key=sc.nextInt();
          for( i=0;i<n;i++){
            if(num[i]==key)
            {
                pos=i;
                break;
                
            }
           
          }
          if(pos!=-1)
          {
            System.out.println("The element "+key+" "+"is found at the postion"+ " "+(pos+1));
          }
          else{
            System.out.println("The elemenet is not founded");
          }
    }
}