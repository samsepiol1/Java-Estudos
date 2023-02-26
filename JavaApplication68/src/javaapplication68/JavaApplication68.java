/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication68;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado;
         Scanner leitor=new Scanner(System.in);
         System.out.println("Digite aqui um número");
         int numero=leitor.nextInt();
         if(numero>0){
             resultado=numero*2;
            System.out.println(resultado);
         }
         if(numero<0){
             resultado=numero*numero;
             System.out.println(resultado);
             
         }
    }
    
}
