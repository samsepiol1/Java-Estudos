/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite aqui a quantidade de notas a serem lidas");
        int quantidade=leitor.nextInt();
        double nota[]=new double[quantidade];
        for(int i =1; i<=quantidade;i++){
        System.out.println("digite a nota de numero"+i);
        nota[i]=leitor.nextDouble();
    }
        }
    }
    

