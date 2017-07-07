/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akdas;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Akdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade;
        int i;
        
        int teste_valor=Integer.MIN_VALUE;
        String nome;
        Scanner leitor=new Scanner(System.in);
        
        for(i=0;i<=2;i++){
            System.out.println("Digite sua idade aqui");
            idade=leitor.nextInt();
            teste_valor=idade;
            if(idade>teste_valor){
               teste_valor=idade;
               System.out.println(idade);
            }
            
           
            }
                
            
           
        }
        
        
        
    }
    

