/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor= new Scanner(System.in);
        double pi;
        double resultado;
        double resultado2;
        double raio1;
        double raio2;
        double resultado_raio;
        double resultado_raio2;
        double resultado_final;
        System.out.println("Digite aqui do primeiro pi");
       pi=leitor.nextDouble();
       System.out.println("Digite aqui o valor do primeiro raio");
       raio1=leitor.nextDouble();
       resultado_raio=raio1*raio1;
       resultado=resultado_raio*pi;
       System.out.println("O primeiro resultado é"+resultado);
       
       System.out.println("Digite o segundo pi");
       pi=leitor.nextDouble();
       System.out.println("Digite aqui valor do segundo raio");
       raio2=leitor.nextDouble();
       resultado_raio2=raio2*raio2;
       resultado2=resultado_raio2*pi;
       System.out.println("o segundo resultado é"+resultado2);
       
       resultado_final=resultado-resultado2;
       System.out.println("A diferença de area entre as duas pizzas é de"+resultado_final);
       
       
       
      
        
       
    }
    
}
