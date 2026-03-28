/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_1_ass_2;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class SET_1_beg_6 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}
