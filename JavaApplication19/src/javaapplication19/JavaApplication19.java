/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner leitor = new Scanner(System.in);       

        int numero=0;

        while(true){

            System.out.print("Digite um numero:");

            numero=leitor.nextInt();

            if(numero!='0' || numero=='0'){

                System.out.println("Numero:"+numero);

                break;
            }
        }
    }
    
}
