import java.util.Scanner;

// Programa Java que guarda en un array 10 números enteros que se leen por teclado. A continuación se recorre el array y calcula cuántos números son positivos, cuántos negativos y cuántos ceros.

public class Arrays {

    public void ValueCounter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the array size:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int contPositive = 0;
        int contNegative = 0;
        int contZero = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter one number:");

            int number = scanner.nextInt();
            array[i] = number;
        }
        scanner.close();

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 0) {
                contZero++;
            } else if (array[i] > 0) {
                contPositive++;
            } else {
                contNegative++;
            }
        }
        System.out.println("There are " + contNegative + " Negative numbers");
        System.out.println("There are " + contPositive + " Positive numbers");
        System.out.println("There are " + contZero + " Zeros");

    }

    public void stringToArray(String word) {
        String[] stringArray = new String[word.length()];
        for (int i = 0; i < word.length(); i++) {
            stringArray[i] = String.valueOf(word.charAt(i));
        }
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
