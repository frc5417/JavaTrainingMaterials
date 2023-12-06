package Material;

import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Enter something in the next line!");
        try (Scanner userInput = new Scanner(System.in)) {
            System.out.println("You entered: " + userInput.next());
        }
    }
}