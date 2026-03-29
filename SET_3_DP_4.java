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
public class SET_3_DP_4 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three digits: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == b) {
            System.out.println(c + " is unique.");
        } else if (a == c) {
            System.out.println(b + " is unique.");
        } else if(b == c){
            System.out.println(a + " is unique.");
        }else{
            System.out.println("Nothing is unique."); 
        }

        scan.close();
    }   
}
