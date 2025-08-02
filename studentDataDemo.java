/*import java.util.Scanner;

class studentData {
    String name;
    int age;
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class studentDataDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        studentData Student = new studentData();
        System.out.println("enter the name");
        Student.name = sc.nextLine();
        System.out.println("enter the age");
        Student.age = sc.nextInt();
        Student.display();
        sc.close();
    }
}*/


import java.util.Scanner;

class StudentData {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String myname) {
        name = myname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int myage) {
        if (myage > 0) {
            age = myage;
        }
    }
}

public class StudentDataDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentData student = new StudentData();
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();
        student.setName(name);
        System.out.print("Enter student's age: ");
        int age = sc.nextInt();
        student.setAge(age);
        System.out.println("\nStudent Data");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        sc.close();
    }
}