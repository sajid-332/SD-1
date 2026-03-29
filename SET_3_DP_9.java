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
public class SET_3_DP_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter work hours for regular days (X): ");
        int X = scan.nextInt();
        System.out.print("Enter work hours on Wednesday (Y): ");
        int Y = scan.nextInt();

        int totalHours = (X * 6) + Y; 
        System.out.println("Total working hours in a week: " + totalHours);

        scan.close();
    }
}
