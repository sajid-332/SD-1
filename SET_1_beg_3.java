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
public class SET_1_beg_3 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        if(number % 2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }  
        scan.close();
    }
}
