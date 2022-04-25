import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a valid option:");
        System.out.println("1 - Fibonacci");
        System.out.println("2 - Values counter");
        System.out.println("3 - String to array");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if (option == 1) {
            Fibonacci fibo = new Fibonacci();
            System.out.println("Please enter the max number:");
            int until = scanner.nextInt();
            fibo.Fibo(until);
        } else if (option == 2) {
            Arrays array = new Arrays();
            array.ValueCounter();
        } else {
            Arrays array = new Arrays();
            System.out.println("Please enter a word:");
            String word = scanner.next();
            array.stringToArray(word);
        }
        scanner.close();
    }

}
