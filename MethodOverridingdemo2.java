//Author:joshna jojo
//Date:07/09/2025
class Bird{
    void fly(){
        System.out.println("bird can fly");
    }

}
class Sparrow extends Bird{
     void fly(){
        System.out.println("Sparrow flies short");}

}
class Eagle extends Bird{
     void fly(){
        System.out.println("Eagle soars high in the sky");}
}
public class MethodOverridingdemo2{
    public static void main(String[] args){
        Bird[] Birds=new Bird[3];
        Birds[0]=new Bird();
        
        Birds[1]=new Sparrow();
        Birds[2]=new Eagle();
      for(Bird b: Birds){
          b.fly();
      }


    }
}