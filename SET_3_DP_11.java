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
public class SET_3_DP_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of pulp in kg (N): ");
        int N = scan.nextInt();

        int notebooks = (N * 1000) / 100; // 1000 pages per kg, 100 pages per notebook
        System.out.println("Number of notebooks that can be made: " + notebooks);

        scan.close();
    }
}
