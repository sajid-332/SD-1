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
public class SET_3_DP_15 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Alice's desired minimum temperature (A): ");
        int A = scan.nextInt();
        System.out.print("Enter Bob's desired maximum temperature (B): ");
        int B = scan.nextInt();
        System.out.print("Enter Charlie's desired minimum temperature (C): ");
        int C = scan.nextInt();

        if (A <= B && C <= B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
     }
}
