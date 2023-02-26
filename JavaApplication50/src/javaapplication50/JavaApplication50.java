/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite aqui a primeira a palavra");
        String nome=leitor.next();
        if (nome.length() >=4 && 
			nome.substring(0, 4).equalsIgnoreCase("João")) { 
            System.out.println("olá João!");
        }else{
            System.out.println("Opa, você não é João");
            
        }
    }
    
}
