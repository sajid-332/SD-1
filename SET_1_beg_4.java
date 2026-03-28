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
public class SET_1_beg_4 {
       public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int max = number1;
        
        if (number2 > max) max = number2;
        if (number3 > max) max = number3; 
         System.out.println("The maximum number is: " + max);
        scan.close();
    }
}
