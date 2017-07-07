/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

/**
 *
 * @author Deus
 */

import java.util.Scanner;
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite aqui o número a ser dobrado várias vezes");
        int numero=leitor.nextInt();
        System.out.println("digite o limite para essa operação");
        int limite=leitor.nextInt();
        System.out.println(dobrarNumeroAteLimite(numero, limite)); 
    }
    public static int dobrarNumeroAteLimite(int numero, int limite){
        for (int aux = numero * 2; aux < limite; aux = numero * 2) { 
			numero = aux; 
		} 
		return numero; 
    }
}
