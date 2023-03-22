/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        int[] vector = new int [100];
        
        
        for (int i=0 ; i<=99 ; i++) {
            vector[i] = i;
        } 
        
        for (int i=99 ; i>=0 ; i--) {
            System.out.print("[" + vector[i] + "]");
            
        } 
        
        System.out.println(" ");
    }
}