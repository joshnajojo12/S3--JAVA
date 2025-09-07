import java.util.Scanner;
class Book{
    String title,author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void display(){
        System.out.println("Book Title:"+title);
        System.out.println("Author:"+author);
    }
}
class Technical extends Book{
    String subject;
    Technical(String title,String author,String subject)
    {
        super(title,author);
        this.subject=subject;
    }
    void display(){
        System.out.println("Book Title:"+title);
        System.out.println("Author:"+author);
          System.out.println("Subject:"+subject);
    }
}
class Story extends Technical{
    String genre;
    Story(String title,String author,String subject,String genre)
    {
        super(title,author,subject);
        this.genre=genre;

    }
    void display(){
    System.out.println("Book Title:"+title);
    System.out.println("Author:"+author);
    System.out.println("Subject:"+subject);
    System.out.println("Gener:"+genre);
}}
public class methodOverridingdemo1{
    public static void main(String[] args)
    {
        Book b;
        b=new Book("General book","Author A");
        b.display();
         b=new Technical("java programming","Author B","computer Science");
        b.display();
        b = new Story("c programming ","Author c","cs","technical");
        b.display();
    }
}