import java.util.Scanner;
class Book{
    String Author,title;
    double price;
    Book(String Author,String title,double price)
    {
        this.Author=Author;
        this.title=title;
        this.price=price;
    }
    void display()
    {
          System.out.println("THE BOOK DETAIES:");
        System.out.println("Author:"+Author);
          System.out.println("Title:"+title);
            System.out.println("Price:"+price);
    }
}

public class BookDemo{
    public static void main(String[] args)
    {
       Book b1= new Book("john","unknown",2000);
       b1.display();
    Book b2= new Book("appu","halo",3000);
       b2.display();

    }

}