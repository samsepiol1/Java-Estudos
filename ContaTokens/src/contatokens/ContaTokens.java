/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatokens;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class ContaTokens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um texto:");
        while(sc.hasNext()){
            i++;
            System.out.println("Token:"+sc.next());
            
        }
        sc.close();
        
    }
    
}
