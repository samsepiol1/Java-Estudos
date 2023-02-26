/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite aqui a nota que vai ser lida:");
        int quantidade=leitor.nextInt();
        double notas[]=new double[quantidade];
        for(int i=1; i<=quantidade;i++){
            System.out.println("Digite a nota de Número"+i);
            notas[i]=leitor.nextDouble();
        }
        
    }
    
}
