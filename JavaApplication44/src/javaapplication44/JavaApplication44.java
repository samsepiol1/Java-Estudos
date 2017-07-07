/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication44;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("coloque aqui o número que voce quer que dobre várias vezes");
        int numero=leitor.nextInt();
        System.out.println("digite um número para o limite da operação");
        int limite=leitor.nextInt();
        System.out.println(dobrarNumeroAteLimite(numero, limite)); 
    }
    
    public static int dobrarNumeroAteLimite(int numero, int limite){
        int dobro=2*numero;
        if(dobro>=limite){
            return numero;
        }else{
            return dobrarNumeroAteLimite(dobro,limite);
        }
    }
}
