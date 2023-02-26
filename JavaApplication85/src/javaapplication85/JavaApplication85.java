/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication85;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        int soma=0;
        int idade;
        float media=0;
        int i;
        do{
            for(i=1;i<=20;i++){
                System.out.println("Digite sua idade aqui");
                idade=leitor.nextInt();
                soma=soma+idade;
               media=soma/20; 
                
            }
        }while(i<=20);
        System.out.println("A soma das idades é"+soma);
        System.out.println("A média das somas das idade é de "+media);
    }
    
}
