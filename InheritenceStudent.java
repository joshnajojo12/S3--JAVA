//Author:Joshna Jojo
//Date:
import java.util.Scanner;
class Student{
    String name;
    int rollNumber;
    String course;
    void setStudentDetailes(String name,int rollNumber,String course){
        this.name=name;
        this.rollNumber=rollNumber;
        this.course=course;
    }
    void displayDetailes(){
        System.out.println("Name:"+name);
        System.out.println("rollNumber:"+rollNumber);
        System.out.println("course:"+course);

    }
}
class StudentAccount extends Student{
    float collegeFees;
    void setCollegeFees(float collegeFees){
        this.collegeFees=collegeFees;
    }
    void DisplayCollegeFees(){
        System.out.println("College Fees:"+collegeFees);
    }
} 
class Hosteller extends StudentAccount{
    float hostelFee;
    float messFee;
    void setHostellerDetailes (float hostelFee,float messFee){
        this.hostelFee=hostelFee;
        this.messFee=messFee;
    }
    void displayHostellerDetailes(){
        System.out.println("hostelFee:"+hostelFee);
        System.out.println("messFee:"+messFee);
        System.out.println("total fee:"+(collegeFees+hostelFee+messFee));
    }
    void printAll()
    {
    displayDetailes();
    DisplayCollegeFees();
     displayHostellerDetailes();
    }
}
class DayScholar extends StudentAccount{
    float busFee;
    void setBusFee(float busFee){
        this.busFee=busFee;
    }   
    void displayBusFee(){
        System.out.println("Bus Fee:"+busFee);
        System.out.println("total:"+(collegeFees+busFee));
    }

void printAll()
    {
    displayDetailes();
    DisplayCollegeFees();
     displayBusFee();
    }
 
        
    
}
public class InheritenceStudent{
    public static void main(String[] args){

    
Scanner sc= new Scanner(System.in);
      
        System.out.println("enter the hosteller's Name");
        String hname=sc.nextLine();
        System.out.println("enter roll number");
        int hrollNumber =sc.nextInt();
       System.out.println("enter course");
        sc.nextLine();  
        String hcourse=sc.nextLine();
        System.out.println("Enter the college Fee");
        float hcollegeFee=sc.nextInt();
        System.out.println("Enter the hostel Fee");
        float hHostelFee=sc.nextInt();
         System.out.println("Enter the mess Fee");
        float hmessFee=sc.nextInt();
        Hosteller host=new Hosteller();
        host.setStudentDetailes(hname,hrollNumber,hcourse);
        host.setCollegeFees(hcollegeFee);
        host.setHostellerDetailes(hHostelFee,hmessFee);
        sc.nextLine();


        System.out.println("enter the dayscholar's Name");
        String dname=sc.nextLine();
        System.out.println("enter roll number");
        int drollNumber =sc.nextInt();
       System.out.println("enter course");
        sc.nextLine();  
        String dcourse=sc.nextLine();
        System.out.println("Enter the college Fee");
        float dcollegeFee=sc.nextInt();
        System.out.println("Enter the bus Fee");
        float dbusFee=sc.nextInt();
         DayScholar day=new DayScholar();
        day.setStudentDetailes(dname,drollNumber,dcourse);
        day.setCollegeFees(dcollegeFee);
        day.setBusFee(dbusFee);
        sc.nextLine();


       

        System.out.println("----HOSTELLER DETAILES----");
        host.printAll();
        System.out.println("----DAY SCHOLAR'S Detailes----");
        day.printAll();
    }} 