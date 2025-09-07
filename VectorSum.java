//Author :joshna
//Date:15-08-25
import java.util.Vector;
public class VectorSum{
    public static void main(String[] args){
        Vector<Integer>numbers=new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("SUM:"+sum);
            }

}