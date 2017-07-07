/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dolar=0.27 ;
        double real;
        double resultado_dolar;
        double resultado_euro;
        double resultado_bitcoin;
        double euro= 4.24;
        double bitcoin=29.34;
        
        
        
        Scanner leitor= new Scanner(System.in);
        System.out.println("Quantos reais você possui?");
         real=leitor.nextInt();
         resultado_dolar=dolar*real;
         resultado_euro=euro*real;
         resultado_bitcoin= bitcoin*real; 
         
         System.out.println("Você possui: " +resultado_dolar+ "Em dolar" );
         System.out.println("Você possui: " +resultado_euro+  "Em euro" );
         System.out.println("Você possui " +resultado_bitcoin+ "Em Bitcoin" );
         
         
         
         
        
        
        
    }
    
}
