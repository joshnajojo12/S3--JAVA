// Author: Joshna Jojo
// Date: 18-07-2025
public class primeNumberUptoLimit {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;

            // check if i is divisible by any number from 2 to i-1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
