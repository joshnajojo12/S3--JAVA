
//Author:Joshna jojo
//Date:3-8-21
import java.util.Scanner;
class circle{
    double radius;
    circle( double radius)
    {
        this.radius=radius;
    }
    
    void display()
    {
        System.out.println("The Area Is:"+(Math.PI*radius*radius));
            System.out.println("The Circumference Is:"+(2*Math.PI*radius));
    }
}


public class circleDemo{
    public static void main(String[] args){
        circle c1=new circle(5);
        c1.display();

    }
}