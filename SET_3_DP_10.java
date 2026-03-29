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
public class SET_3_DP_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Input status of the bottles
        System.out.print("Enter status of first bottle (0 for empty, 1 for full): ");
        int B1 = scan.nextInt();
        
        System.out.print("Enter status of second bottle (0 for empty, 1 for full): ");
        int B2 = scan.nextInt();
        
        System.out.print("Enter status of third bottle (0 for empty, 1 for full): ");
        int B3 = scan.nextInt();

        if ((B1 == 0 && B2 == 0) || (B1 == 0 && B3 == 0) || (B2 == 0 && B3 == 0)) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }

        scan.close();
    }
}
