//Author:joshna jojo
//Date:13/08/2025
import java.util.Scanner;
class Employee{
    String name,adress;
    int age,mob;
    float sal;
    void setDetailes(String name,String adress,int age,int mob,float sal){
        this.name=name;
        this.adress=adress;
        this.age=age;
        this.mob=mob;
        this.sal=sal;

    }
    void printBasicDetailes(){
        System.out.println(" Name:"+name);
        System.out.println("Adress :"+adress);
        System.out.println("Age :"+age);
        System.out.println("Mobile :"+mob);
    
    }
     void PrintSalary(){
        System.out.println("Salary :"+sal);
    }
}
class officer extends Employee{
    String spl;
    void SetSpecialization(String spl){
        this.spl=spl;
    }
     void printspecialization(){
        System.out.println("Specalization :"+spl);
    }


void printAll(){
    printBasicDetailes();
    PrintSalary();
    printspecialization();


}}

class manager extends Employee{
    String dep;
    void setDepartment(String dep){
        this.dep=dep;
    }
    void printDep(){
        System.out.println("Department :"+dep);
    }
    void printAll(){
    printBasicDetailes();
    PrintSalary();
    printDep();

}
}
public class InheritenceEmp{
    public static  void main(String[] args){

        Scanner sc= new Scanner(System.in);
        officer off =new officer();
        System.out.println("enter officer's Name");
        String oName=sc.nextLine();
        System.out.println("enter Aress");
        String oAdress=sc.nextLine();
        System.out.println("enter office's Age");
        int  oAge=sc.nextInt();
        System.out.println("enter mobile no.");
        int omob=sc.nextInt();
        System.out.println("enter the salary");
        float osalary=sc.nextFloat();
        System.out.println("enter Sepailazation");
        sc.nextLine();  
        String ospl=sc.nextLine();
 
       off. setDetailes(oName,oAdress,oAge,omob,osalary);
        off.SetSpecialization(ospl);


        manager man =new manager();
        System.out.println("enter Manager's Name");
        String mName=sc.nextLine();
        System.out.println("enter Aress");
        String mAdress=sc.nextLine();
        System.out.println("enter office's Age");
        int  mAge=sc.nextInt();
        System.out.println("enter mobile no.");
        int mmob=sc.nextInt();
        System.out.println("enter the salary");
        float msalary=sc.nextFloat();
        System.out.println("enter department");
        sc.nextLine();
        String mdep=sc.nextLine();
 
        man.setDetailes(mName,mAdress,mAge,mmob,msalary);
        man.setDepartment(mdep);

        System.out.println("----Officer detailes----");
        off.printAll();
        System.out.println("------Managers Detailes----");
        man.printAll();
        
    }
}