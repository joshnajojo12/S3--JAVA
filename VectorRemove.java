//Author :joshna
//Date:15-08-25
import java.util.Vector;
public class VectorRemove{
    public static void main(String[] args){
        Vector<String>colors=new Vector<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.remove("Green");
        for(String color:colors)
        System.out.println(color);

    }
}