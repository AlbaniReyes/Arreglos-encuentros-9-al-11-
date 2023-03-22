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
public class Ejer_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int dim=3;    
        
        int[][] matriz = generadorMatriz(dim);
        
        escribirMatriz(dim,matriz);
        
        System.out.println("¿ES UNA MATRIZ MAGICA?");
        if (generadorMatrizM(dim,matriz)) 
            System.out.println("SI");
          else 
            System.out.println("NO");
        
        
        
        
    }
    
    private static boolean enMatriz(int[][] matriz, int valor){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]==valor) return true;                
            }
        }
        return false;
    }
    
    public static int[][] generadorMatriz (int dim) {
    int[][] matriz = new int [dim][dim];
    int valor;
    Scanner leer = new Scanner (System.in);
        for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                do {
                    valor = leer.nextInt(); 
                    } while ( enMatriz(matriz,valor));
                matriz1[c] = valor;
            }
        }  
  return matriz; 
    
}
    
    public static boolean generadorMatrizM (int dim,int[][] matriz) {
    boolean validar = true ; 
    int suma = 0;
    int sumaDiagonal=0;
    
    for (int c=0 ; c < matriz.length; c++) {
        suma=suma+matriz[0][c];
    }
    // validar suma primera columna    
      
    for (int f=0 ; f < matriz.length; f++) {
        int sumaFila=0;
        int sumaColumna=0;
        
        for (int c=0 ; c < matriz.length; c++) {
        sumaFila+=matriz[f][c]; 
        sumaColumna+=matriz[c][f];
        }
        sumaDiagonal+=matriz[f][f];
        
        if (sumaFila!=suma) return false ; 
        if (sumaColumna!=suma) return false ; 
        
    }  
    
        if (sumaDiagonal!=suma) return false ;
        
        sumaDiagonal = matriz[0][2] + matriz[1][1] + matriz[2][0];
        
        if (sumaDiagonal!=suma) return false ;

    
  return validar;
    
    }    
    
    public static void escribirMatriz (int dim, int[][] matriz) {
    for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print("[" + matriz1[c] + "]");
            }
            System.out.println("");
        }   
    
    
}
}