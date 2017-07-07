/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impara_do_while_for;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Impara_do_while_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        
        for(int i=1; i<=10; i++){
            if (i%2==1){
                System.out.println("Lista de número Impares");
                System.out.println(i);
            }
        }
        
    }
    
}
