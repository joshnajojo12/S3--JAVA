//Author :joshna
//Date:15-08-25
import java.util.Vector;
import java.util.Scanner;
public class VectorSearch{
    public static void main(String[] args){
        Vector<String>items=new Vector<>();
            items.add("pen");
            items.add("NoteBook");
            items.add("Eraser");
            items.add("Marker");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the item to be Search");
            String input=sc.nextLine();
            if(items.contains(input)){
                System.out.println("the item is found");
            }
            else{
                System.out.println("item not found");
            }
        }
}