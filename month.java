import java.util.Scanner;
public class month{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number between 1 to 12");
        int month= sc.nextInt();
        String monthname;
        switch(month){
            case 1: monthname="Januvary";
            break;
            case 2:monthname="Februvary";
            break;
            case 3: monthname="march";
            break;
            case 4: monthname="April";
            break;
            case 5: monthname="may";
            break;
            case 6: monthname="june";
            break;
            case 7:monthname="july";
            break;
            case 8: monthname="august";
            break;
            case 9:monthname="september";
            break;
            case 10: monthname="october";
           break;
           case 11: monthname="november";
           break;
           case 12: monthname="december";
           break;
           default:monthname="invalid";


        }
        System.out.println(monthname);
    }
}