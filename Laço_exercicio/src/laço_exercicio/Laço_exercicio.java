/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laço_exercicio;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Laço_exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite seu nome aqui");
        nome=leitor.nextLine();
        for(int i=1; i<=10;i++){
            System.out.println(nome);
        }
        
    }
    
}
