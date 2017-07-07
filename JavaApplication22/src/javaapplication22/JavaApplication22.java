/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leitor= new Scanner(System.in);
		System.out.println("Digite a quantidade de notas a serem lidas");
		int quantidade = leitor.nextInt();
		double notas[] = new double[quantidade];
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Digite a nota de número " + i);
			notas[i] = leitor.nextDouble();
                }
    }
}

        //aqui faz o processamento da nota
        
        
    
        
    
    

