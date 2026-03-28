/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_1_ass_2;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class SET_1_beg_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        
        System.out.println("Choose an operation: (+, -, *, /)");
        char operation = scan.next().charAt(0);

        if (operation == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation == '/') {
            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero!");
            }
        } else {
            System.out.println("Invalid operation!");
        }
        
        scan.close();
    }
}

