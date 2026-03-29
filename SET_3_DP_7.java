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
public class SET_3_DP_7 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter start time (X): ");
        int X = scan.nextInt();

        if (X + 3 <= 10) {
            System.out.println("Can complete");
        } else {
            System.out.println("Cannot complete");
        }

        scan.close();
    }
}
