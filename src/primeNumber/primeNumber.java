package primeNumber;

public class primeNumber {
    public static void main(String[] args) {
        int number = 45;
        boolean isPrime = true;

        if (number < 1) {
            System.out.println("Number cannot be negative !");
            return;
        }
        if (number == 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

