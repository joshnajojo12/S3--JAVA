import system.util.Scanner;
public class username{
    public static void main(String[] args)
    {
           String username,password;
        Scanner sc= new Scanner(System.in);
     
        System.out.println("please enter the username");
        username=sc.nextLine();
        System.out.println("please enterd the password");
        password=sc.nextLine();
        if( username=="joshna"&&   password=="joshna@2006")
        {
            System.out.println("sucessfuly regesterd");
        }
        else if(username !="joshna"&&   password=="joshna@2006")
        {
            System.out.println("inncorrect username");

        }
        else if(username =="joshna"&&   password!="joshna@2006")
        {
            System.out.println("inncorrect password");
            
        }
        else if(username !="joshna"&&   password!="joshna@2006")
        {
            System.out.println("not regesterd");
            
        }
    }
}