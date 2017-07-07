/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite aqui a primeira palavra");
        String nome1=leitor.next();
        char[] caracteres=nome1.toCharArray();
        System.out.println("inverso");
        for(int i=caracteres.length -1; i>=0; i--);
        int i = 0;
        System.out.print (caracteres[i]);
    }
    
}
