/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication46;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite aqui a primeira nota");
        double nota1=leitor.nextDouble();
        System.out.println("digite aqui a segunda nota");
        double nota2=leitor.nextDouble();
        System.out.println("digite aqui a terceira nota");
        double nota3=leitor.nextDouble();
        System.out.println("digite aqui a quarta nota");
        double nota4=leitor.nextDouble();
        double media=calcularMedia(nota1,nota2,nota3,nota4);
        
    }
  public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) { 
      return(nota1+nota2+nota3+nota4)/4;
  }
}
