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
public class SET_3_DP_12 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of children (N): ");
        int N = scan.nextInt();
        System.out.print("Enter number of candies available (X): ");
        int X = scan.nextInt();

        int requiredCandies = N - X;
        int packetsToBuy = (requiredCandies + 3) / 4; // Round up division by 4
        System.out.println("Minimum packets to buy: " + packetsToBuy);

        scan.close();
    }
}
