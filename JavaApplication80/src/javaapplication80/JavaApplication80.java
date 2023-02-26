/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication80;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int soma = 0;
       int j;
       int numero;
       
        Scanner leitor=new Scanner(System.in);
        for(j=1;j<=10;j++){
            System.out.println("Digite um número aqui");
            numero=leitor.nextInt();
            soma=soma+j;
    
        
        }
        System.out.println(soma);
        
       
        
        
       
        
    }
    
}
