//Author: Joshna Jojo
//Date: 25-07-2025
import java.util.Scanner;
class BankAccount{
    String AccountHolder;
    long AccountNumber;
    double Balance;
     BankAccount(String AccountHolder,long AccountNumber, double Balance)
     {
        this.AccountHolder=AccountHolder;
         this.AccountNumber=AccountNumber;
         this.Balance=Balance;
     }
     void calculate(double amount)
     {
        if(amount>0){
            Balance+=amount;
            System.out.println("DEPOSITED:"+amount);
        }
        else{
            System.out.println("invalid ");
        }
     }
     void displayDetails()
     {
        System.out.println("Account Holder:"+AccountHolder);
        System.out.println("Account AccountNumber:"+AccountNumber);
         System.out.println("Balance:"+Balance);
     }
}

public class Bank{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the accountholder");
        String accHold=sc.nextLine();
         System.out.println("enter the accountNumber");
            int accNum=sc.nextInt();
            sc.nextLine();
                System.out.println("enter the initial balance");
                 double initbalance=sc.nextInt();
                 BankAccount account=new BankAccount(accHold,accNum,initbalance);
                 account.calculate(1000);
                 account.displayDetails();


    }
}