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
public class SET_3_DP_1 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A & B : ");
        int A = scan.nextInt();
        int C = scan.nextInt();
        int B = (A+C)/2;
        
        if((A+C)%2 == 0){
            System.out.println("B is intager");
        }else{
            System.out.println("B is not intager");
        } 
        scan.close();
    }
}
