/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_2_ass_2;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class SET_2_int_6 {
 public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to search: ");
        int search = scan.nextInt();
        boolean found = false;

        for (int num : numbers) {
            if (num == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found.");
        }

        scan.close();
    }   
}
