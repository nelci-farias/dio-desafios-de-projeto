/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula08;

/**
 *
 * @author Nelci Farias
 */
public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int C=1;
        int L=1;
        int M=11;
        
        do {
            C=1;
            M=11;
            do {
                if(L== 1){
                    System.out.print("X");
                }else if ((C == L)||(M == L)) {
                    System.out.print("X");
                }else{
                    System.out.print(" ");
                }
                C++;
                M--;
            }while(C <= 11);
            System.out.println("");
            L++;            
        }while (L < 7);
    }
}
