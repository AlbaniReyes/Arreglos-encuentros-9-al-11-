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
public class Ejer_2 {

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
            vector[i] = (int) (Math.random() * 11);
        } 
        
        for (int i=0 ; i<=dim-1 ; i++) {
            System.out.print("[" + vector[i] + "]");
            
        } 
        
        System.out.println("");
        
        System.out.println("INGRESE EL NUMERO QUE QUIERE BUSCAR DENTRO DEL VECTOR");
        int buscar=leer.nextInt();
        int num=0;
        int cont=0;
        
        for (int i=0 ; i<=dim-1 ; i++) {
            num=vector[i];
            if (buscar==num){
                cont=cont+1;
                System.out.println("El numero " + buscar+ " se encuentra en la posicion " + i + " del vector " + cont + " cantidad de veces");
            } 
        }
        
        if (cont==0){
            System.out.println("El numero buscado no se encuentra en el vector");
        }
        
        } 
        
        
        
        
    }
    

