/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        		Scanner leitor = new Scanner(System.in);
System.out.println("digite um números");
numero=leitor.nextInt();
if(numero>15){
    System.out.println("o numero é maior que 5");
}else if (numero==15){
    System.out.println("o numero é igual a 5");
}else if (numero<15){
    System.out.println("o número é menor que 15");
}
       
    }
    
}
