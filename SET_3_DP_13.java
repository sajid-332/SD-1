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
public class SET_3_DP_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter topic number (X): ");
        int X = scan.nextInt();

        if (X == 1 || X == 2 || X == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scan.close();
    }
}
