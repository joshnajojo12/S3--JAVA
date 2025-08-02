import java.util.Scanner;

class Calculate {
    double number1, number2;
    Calculate(double num1, double num2) {
        number1 = num1;
        number2 = num2;
    }
    double add() {
        return number1 + number2;
    }
    double subtraction() {
        return number1 - number2;
    }
    double division() {
        return number1 / number2;
    }
    double multiplication() {
        return number1 * number2;
    }
}

public class calculatoe {
    public static void main(String[] args) {
        String choice;
        double result = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 for add, 2 for subtraction, 3 for multiplication, 4 for division");
            int n = sc.nextInt();
            System.out.println("Enter the two numbers");
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            Calculate c1 = new Calculate(n1, n2);

            switch (n) {
                case 1:
                    result = c1.add();
                    break;
                case 2:
                    result = c1.subtraction();
                    break;
                case 3:
                    result = c1.multiplication();
                    break;
                case 4:
                    result = c1.division();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to continue y/n");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));
        System.out.println("Thank you for using calculator");
        sc.close();
    }
}