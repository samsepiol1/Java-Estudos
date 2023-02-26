/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class ParouImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Insira aqui um número");
        numero=leitor.nextInt();
        if(numero%2==0){
            System.out.println("Numero Par!");
        }
        else{
            System.out.println("Numero Impar!");
        }
        
        
       
    }
    
}
