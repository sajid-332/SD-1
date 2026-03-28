package com.mycompany.sdas1;
import java.util.Scanner;

/**
 * @author hp
 */
public class JavaUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();
    }
}