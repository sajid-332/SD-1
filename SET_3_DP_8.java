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
public class SET_3_DP_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total sections (X): ");
        int X = scan.nextInt();
        System.out.print("Enter students per section (Y): ");
        int Y = scan.nextInt();
        System.out.print("Enter total passed students (Z): ");
        int Z = scan.nextInt();

        int totalStudents = X * Y;

        if (Z > totalStudents / 2) {
            System.out.println("More than 50% of students passed.");
        } else {
            System.out.println("Less than 50% of students passed.");
        }

        scan.close();
    }
}
