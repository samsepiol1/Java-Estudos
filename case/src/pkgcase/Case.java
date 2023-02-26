/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgcase;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra;
        Scanner leitor= new Scanner (System.in);
        System.out.println("Digite uma letra do alfabeto");
        letra=leitor.nextLine().charAt(0);
        switch(letra){
            case 'A':
                System.out.println("Arara");
                break;
            case 'B':
                System.out.println("Bola");
                break;
            case 'C':
                System.out.println("Casa");
                break;
            case 'D':
                System.out.println("Dados");
                break;
            case 'E':
                System.out.println("Escada");
                break;
            default:
                System.out.println("Letra ainda sem palavra cadastrada");
                
            
                
            
              
        }
        
    }
    
}
