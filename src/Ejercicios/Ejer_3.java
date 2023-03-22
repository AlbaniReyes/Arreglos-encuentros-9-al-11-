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
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("INGRESE LA DIMENSION QUE QUIERE PARA SU VECTOR");
        int dim=leer.nextInt();

        int[] vector = new int [dim];
        
        
        for (int i=0 ; i<=dim-1 ; i++) {
            vector[i] = (int) (Math.random() * 100001);
        } 
        
        for (int i=0 ; i<=dim-1 ; i++) {
            System.out.print("[" + vector[i] + "]");
            
        } 
        
        System.out.println("");

        int[] contador= new int [5]; 
            
        for (int i=0 ; i<contador.length ; i++) {

            int num;
            
            num = vector[i];
            
            
            
            
        }

}
}

