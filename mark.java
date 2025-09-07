
//Author:Joshna jojo
//Date:3-8-25
import java.util.Scanner;
class Marks{
    double mark1,mark2,mark3;
    double total,average;
    Marks(double mark1,double mark2,double mark3){
        this.mark1=mark1;
         this.mark2=mark2;
          this.mark3=mark3;

    }
    void calculate()
    {
      total=mark1+mark2+mark3;
       average=total/3;
      

    }
}

public class mark{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("enter the 3 mark");
        m1=sc.nextInt();
          m2=sc.nextInt();
            m3=sc.nextInt();
            Marks m=new Marks(m1,m2,m3);
            m.calculate();
            System.out.println("Total Mark"+m.total);
             System.out.println("Average mark"+m.average);
            
    }
}