/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa_mais_velha;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Pessoa_Mais_Velha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade1,idade2;
        Scanner leitor= new Scanner(System.in);
        System.out.println("Digite aqui a sua idade");
        idade1=leitor.nextInt();
        System.out.println("Insira aqui uma outra idade");
        idade2=leitor.nextInt();
        if(idade1>idade2){
            System.out.println("O primeiro é mais velho");
            System.out.println(idade1+">"+idade2);
        }
        else{
            System.out.println("A segunda é mais velha");
        }
        
    }
    
}
