/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdas1;

/**
 *
 * @author hp
 */
public class JavaTypeCasting {
       public static void main(String[] args) {
        int i = 100;
        double d = i; // Implicit casting
        System.out.println("Implicit casting: " + d);
        
        double e = 9.78;
        int j = (int) e; // Explicit casting
        System.out.println("Explicit casting: " + j);
    }
}
