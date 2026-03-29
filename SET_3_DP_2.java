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
public class SET_3_DP_2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scan.nextLine();

        String[] words = sentence.split(" ");
        for (String word : words) {
            if (word.length() > 10) {
                // Generate the abbreviation: first letter + length of middle letters + last letter
                String abbreviation = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.print(abbreviation + " ");
            } else {
                // For short words, print them as is
                System.out.print(word + " ");
            }
        }
        scan.close();
    }
}
