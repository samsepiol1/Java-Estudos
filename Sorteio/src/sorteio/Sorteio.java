/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteio;

/**
 *
 * @author Deus
 */
import java.util.Scanner;

public class Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long numero=Math.round(Math.random()*10);
        long chute;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10 ");
        chute=leitor.nextLong();
        while(numero!=chute){
            System.out.println("Digite um numero de 1 a 10");
            chute=leitor.nextLong();
            
        }
        
        System.out.println("Parabéns você acertou");
    }
    
}
