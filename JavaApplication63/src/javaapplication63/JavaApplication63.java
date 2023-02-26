/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int força;
       int g=10;
       int m1;
       int m2;
       int r;
       
        
        Scanner leitor=new Scanner(System.in);
      System.out.println("insira aqui a massa do primeiro planeta");
      m1=leitor.nextInt();
      System.out.println("Insira aqui a masssa do segundo planeta");
      m2=leitor.nextInt();
      System.out.println("Insira aqui o raio entre eles");
      r=leitor.nextInt();
      força=g*m1*m2/r;
      System.out.println("De acorodo com a lei da gravitação universal"+força);
        
    }
    
}
