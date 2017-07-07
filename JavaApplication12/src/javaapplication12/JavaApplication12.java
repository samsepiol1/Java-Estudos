/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Deus
 */

import java.util.Scanner;

public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // TODO code application logic here
         int r;
        int r2;
        int r3;
        int r4;
        int r5 = 0;
  int resistencia;
      
        
        Scanner leitor = new Scanner (System.in);
        System.out.println("coloque aqui os valores da resistencia");
        r = leitor.nextInt ();
        r2 = leitor.nextInt ();
        r3 = leitor.nextInt ();
        r4 = leitor.nextInt ();
        resistencia=(r+r2+r3+r4+r5);
      
        
        System.out.println("o valor da resistencia é "+resistencia);
        
      
        
        
        
        
       
        
        
        
        
               
        
    }
    
}
