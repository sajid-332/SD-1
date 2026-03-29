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
public class SET_3_DP_3 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        
        String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println("Capitalized: " + capitalized);

        scan.close();
    }
}
