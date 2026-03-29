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
public class SET_3_DP_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of friends (N): ");
        int N = scan.nextInt();
        System.out.print("Enter the cost of one subscription (X): ");
        int X = scan.nextInt();

        int requiredSubscriptions = (N + 5) / 6; // Round up for N friends
        int totalCost = requiredSubscriptions * X;

        System.out.println("Total cost: " + totalCost);

        scan.close();
    }
}
