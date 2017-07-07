/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int area;
       int raio;
        int pi=3;
       
       Scanner leitor=new Scanner(System.in);
       
      System.out.println("Coloque aqui o raio");
      raio=leitor.nextInt();
      
     area=raio*pi/2;
     
     System.out.println("o resultado é"+area);
     
      
      
     
    }
    
}
