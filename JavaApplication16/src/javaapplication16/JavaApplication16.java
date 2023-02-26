/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner leitor = new Scanner(System.in);

        System.out.print("Escolha \'s\' para SIM e \'n\' para NÃO:");

        char letra = leitor.nextLine().charAt(0);

        if(letra!='s' || letra!='n'){

        }else if(letra=='s' || letra=='n'){

            switch(letra){

                case 's':

                    System.out.println("Letra s");

                    break;

                default:

                    System.out.println("Letra n");

            }

        }
    }
    
}
