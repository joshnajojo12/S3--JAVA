import java.util.Vector;
import java.util.Collections;
public class VectorLargest{
    public static void main(String[] args)
    {
        Vector<Integer> numbers=new Vector<>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int max = Collections.max(numbers);
        System.out.println("The largest number is "+max);
    }
}