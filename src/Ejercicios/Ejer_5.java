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
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ CUADRADA");
        int dim=leer.nextInt();
        
        int[][] matriz = generadorMatriz(dim); 
        

        System.out.println("-------------------");
        
        generadorMatrizT(dim,matriz);
        
    }

public static int[][] generadorMatriz (int dim) {
    int[][] matriz = new int [dim][dim];
        for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                matriz1[c] = (int) (Math.random() * 10)-5;
                System.out.print("[" + matriz1[c] + "]");
            }
            System.out.println("");
        }  
  return matriz;  
} 

public static int[][] generadorMatrizT (int dim,int[][] matriz) {
    int[][] traspuesta = new int [dim][dim];
    for (int f=0 ; f < traspuesta.length; f++) {
        for (int c=0 ; c < traspuesta.length; c++) {
            traspuesta[f][c]=(matriz[c][f])*-1;
            System.out.print("[" + traspuesta[f][c] + "]");
            } 
        System.out.println("");
    }  
  return traspuesta;
}   
}
    

