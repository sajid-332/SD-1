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
public class SET_3_DP_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter profit of A (P): ");
        int P = scan.nextInt();
        System.out.print("Enter profit of B (Q): ");
        int Q = scan.nextInt();
        System.out.print("Enter profit of C (R): ");
        int R = scan.nextInt();
        System.out.print("Enter profit of D (S): ");
        int S = scan.nextInt();

        if (P > (Q + R + S) || Q > (P + R + S) || R > (P + Q + S) || S > (P + Q + R)) {
            System.out.println("Monopoly exists.");
        } else {
            System.out.println("No monopoly.");
        }

        scan.close();
    }
}
