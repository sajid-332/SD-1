/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_2_ass_2;

/**
 *
 * @author hp
 */
public class SET_2_int_5 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int EC = 0;
        int OC = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                EC++;
            } else {
                OC++;
            }
        }

        System.out.println("Even numbers: " + EC);
        System.out.println("Odd numbers: " + OC);
    }
}
