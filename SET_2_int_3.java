/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.set_2_ass_2;

/**
 *
 * @author hp
 */
public class SET_2_int_3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // Storing 5 numbers in an array
        int min = numbers[0];
        // Printing the numbers
        for (int num : numbers) {
            if(num < min){
                min = num;
            }
        }
        System.out.println("Maximum Array Number : " + min);
    }
}
