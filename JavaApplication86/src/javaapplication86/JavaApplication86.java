/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       String nome;
       int idade;
       int j;
       int menor=0;
        Scanner leitor=new Scanner(System.in);
        for (int i=0; j=0; i<3; j<3; i++) {
            System.out.println ("Insira o nome da pessoa: " +nome);
            nome = leitor.nextLine();
            System.out.println ("Insira a idade do(a) " +nome);
            idade = leitor.nextInt();
	        if (idade < menor) {
		       menor = idade;
		       nome = nome;
            }
     }

System.out.println ("Menor idade: " +menor);
System.out.println ("Nome: " +nome);
        
           
                    
            
                
               
                
                
                   
            
                
        
        }while(i<=20);
        
    }
    
}
