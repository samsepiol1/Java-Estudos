/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication61;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Deus
 */
public class JavaApplication61 {
public static void ExibirRelatorio() throws InputMismatchException{

        Scanner l = new Scanner(System.in);

System.out.println ("Digite seu nome");

        String nome = l.next();

        System.out.println ("Digite sua idade");

        int idade = l.nextInt();

        System.out.println ("*******Relatório**********");

        System.out.println ("O nome é:" + nome);

        System.out.println ("A idade é:" + idade);

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {

ExibirRelatorio ();      

        }

catch (InputMismatchException e) {

System.err.println("Os argumentos esperados pelo método ExibirRelatorio não foram fornecidos adequadamente!");
    }
    
}
}
