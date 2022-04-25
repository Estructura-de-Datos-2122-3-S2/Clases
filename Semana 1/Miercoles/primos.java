import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("***Welcome***");
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("The number is not prime");
        } else {
            if (isPrime(number)) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}