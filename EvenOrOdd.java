// To check whether a number is even or odd

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter the number: ");

        if (x.hasNextInt()) {
            int num = x.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer...");
        }

        x.close();
    }
}