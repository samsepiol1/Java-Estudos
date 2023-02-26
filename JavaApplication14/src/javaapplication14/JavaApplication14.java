/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic 
       int fat=1;
       int valor=5;
       int num = 0;
       int soma = 0;
       int opcao_usuario;
       Scanner leitor=new Scanner(System.in);
       System.out.println("digie 1 para calcular o fatorial e 2 para somar os números a e b com valores 0 e 0");
       opcao_usuario=leitor.nextInt();
       soma = soma + num;
        num--;
       
              
       
for( int i = 1; i <= valor; i++)
{
             
        fat *= i;
        
       if (opcao_usuario==1){
           System.out.println( "O fatorial de " + valor + " é igual a " + fat );

       }
       if(opcao_usuario==0){
           System.out.println("o resultado da soma entre esses dois numeros é"+soma);
       }

               
       } 
    }

    }
    
    

