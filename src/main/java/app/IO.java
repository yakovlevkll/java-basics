/*
Inputing and outputing information
*/

package app;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        String template = String.format("Hello, %s! Your age is %d", name, age);
        System.out.println(template);

        scanner.close();
    }
}
