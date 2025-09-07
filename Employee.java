
//Author:Joshna jojo
//Date:3-8-25
import java.util.Scanner;
class Employees{
String empName,empId;
double salary;


Employees(String empName,double salary,String empId)
{
    this.empName=empName;
    this.salary=salary;
    this.empId=empId;
}
void display()
{
    System.out.println("employee name:"+empName);
      System.out.println("employee salary:"+salary);
        System.out.println("employee empId:"+empId);
}}
public class Employee{
public static void main(String[] args)
{
    String Name,id;
    double salary;
    Scanner sc= new Scanner (System.in);
    Employees[] array=new Employees[2];
    for(int i=0;i<2;i++)
    {
      System.out.println("enter the name of the  employee");
      Name=sc.nextLine();
        System.out.println("enter the salary");
        salary=sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt
         System.out.println("enter the id");
        id=sc.nextLine();
        
    
    array[i]= new Employees(Name ,salary,id);
}
for(int i=0;i<2;i++){
    array[i].display();
}
}}