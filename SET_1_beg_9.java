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
public class SET_1_beg_9 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scan.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 1 to " + N + " is: " + sum);
        scan.close();
    }
}   

