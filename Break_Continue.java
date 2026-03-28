/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdas1;

/**
 *
 * @author hp
 */
public class Break_Continue {
     public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; 
            }
            System.out.println("Number: " + i);
            if (i == 4) {
                break;  
            }
        }
    }
}
