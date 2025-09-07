//Author :joshna
//Date:15-08-25
import java.util.Vector;
public class VectorAdd{
    public static void main(String[] args){
Vector<String> fruits = new Vector<>();

   
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Orange");

     
        System.out.println("List of Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);   
                 }


    }
}