/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_letras;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Com_letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero1,numero2;
        int resultado ;
        char opcao;
        
        Scanner leitor=new Scanner(System.in);
        System.out.println("A-Soma\nB-sub\nC-div\nD-mult");
        opcao=leitor.nextLine().charAt(0);
        System.out.println("Insira aqui um número");
        numero1=leitor.nextInt();
        System.out.println("Insira aqui outro número");
        numero2=leitor.nextInt();
        
        
        if(opcao=='A'){
            resultado=numero1+numero2;
            System.out.println("O resultado da soma foi:\n"+resultado);
        } else if(opcao=='B'){
            resultado=numero1-numero2;
            System.out.println("O resultado da subtração foi:\n"+resultado);
            
            
        } else if(opcao=='C'){
            resultado=numero1/numero2;
            System.out.println("O resultado da divisão foi:\n"+resultado);
            
            
        } else if(opcao=='D'){
            resultado=numero1*numero2;
            System.out.println("o resultado da multiplicação foi de:\n"+resultado);
        }
        else{
            System.out.println("Opção selecionada inválda");
        }
    }
    
}
