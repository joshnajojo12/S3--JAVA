import java.util.Scanner;

public class Detailes {
    public static void main(String[] args) {
        String name;
        int age, attendancePercentage;
        long phone;
        double cgpa, attendanceMark;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = sc.nextLine();

        System.out.println("Enter the CGPA:");
        cgpa = sc.nextDouble();

        System.out.println("Enter your age:");
        age = sc.nextInt();

        System.out.println("Enter your attendance percentage:");
        attendancePercentage = sc.nextInt();

        System.out.println("Enter your phone number:");
        phone = sc.nextLong();

        // Calculate attendance mark
        if (attendancePercentage >= 90) {
            attendanceMark = 10;
        } else {
            attendanceMark = attendancePercentage / 10.0;
        }

        // Output details
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        System.out.println("CGPA is: " + cgpa);
        System.out.println("Phone number is: " + phone);
        System.out.println("Attendance Mark is: " + attendanceMark);

        sc.close();
    }
}
