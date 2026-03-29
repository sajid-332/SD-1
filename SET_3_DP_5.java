/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_3_ass_2;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class SET_3_DP_5 {
      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A , B & C: ");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        double average = (A + B) / 2.0;
        
        if (average > C) {
            System.out.println("The average is greater than C.");
        } else {
            System.out.println("The average is not greater than C.");
        }

        scan.close();
    }
}   

