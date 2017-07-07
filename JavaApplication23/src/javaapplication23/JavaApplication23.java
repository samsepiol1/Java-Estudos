/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication23;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor= new Scanner(System.in);
        System.out.println("digite aqui o primeiro nome para compração");
        String nome1=leitor.next();
        System.out.println("digite aqui o segundo nome para compração");
        String nome2=leitor.next();
        nome1=nome1.toUpperCase();
        nome2=nome2.toUpperCase();
        if(nome1.equals(nome2)){ ;
        System.out.println("nomes digitados são iguais");
        		} else {
            System.out.println("nome digitados são diferentes");
            


            
        }
       System.out.println(nome1);
       System.out.println(nome2);
       
    }
}
    


