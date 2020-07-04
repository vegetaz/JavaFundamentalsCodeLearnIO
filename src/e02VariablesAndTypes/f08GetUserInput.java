package e02VariablesAndTypes;

import java.util.Scanner;

/*Chạy chương trình để thấy cách mà Scanner hoạt động.*/
public class f08GetUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a number: ");

        int aNumber = scanner.nextInt();  // Read user input
        System.out.println("The number is: " + aNumber);  // Output user input

        System.out.print("Enter a boolean: ");
        boolean aBool = scanner.nextBoolean(); // Read user input
        System.out.println("The boolean is: " + aBool);  // Output user input
    }
}
