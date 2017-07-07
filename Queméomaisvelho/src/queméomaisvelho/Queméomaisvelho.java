/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queméomaisvelho;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Queméomaisvelho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade1;
        int idade2;
        String nome1;
        String nome2;
        Scanner leitor=new Scanner(System.in);
        System.out.println("coloque aqui o primeiro nome");
        nome1=leitor.nextLine();
        System.out.println("digite aqui o segundo nome");
        nome2=leitor.nextLine();
        System.out.println("insira aqui a primeira idade");
        idade1=leitor.nextInt();
        System.out.println("insira aqui a segunda idade");
        idade2=leitor.nextInt();
        if (idade1>idade2){
            System.out.println("a pessoa mais velha é"+nome1);
        }else{
            System.out.println("a pessoa mais velha é"+nome2);
            
        }
                
        
        
               
    }
    
}
