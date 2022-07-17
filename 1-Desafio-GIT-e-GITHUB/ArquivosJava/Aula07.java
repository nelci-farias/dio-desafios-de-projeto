/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Nelci Farias
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("----------*-Aula-07-*----------");
        
        int k=0;
        
        do{
            System.out.println(k);
            k++;
        }while(k < 6);
       
        System.out.println("----------*-*-*----------");
        
        Scanner sc= new Scanner (System.in);
        System.out.println("Digite um numero menor do que 50:");
        
        int L = sc.nextInt();
        
        if(L <= 50){
           do{
                System.out.println(L);
                L++;
            }while(L <= 50); 
        }else{
            System.out.println("Numero invalido!");
        }
        
        System.out.println("----------QUADRADOS-COM-X----------");
       
        int Li=1;
        int Col=1;
        
       do {
            Col=1;
            do {
                if((Col == 1) || (Col == 8)){
                    System.out.print("X");
                }else if((Li== 1) || (Li== 6)){
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
                Col++;
            }while(Col <= 8);
            
            System.out.println("");
            Li++;            
        }while (Li < 7);
    }
    
}
