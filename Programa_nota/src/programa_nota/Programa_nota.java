/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_nota;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Programa_nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite uma única nota");
        int nota=leitor.nextInt();
        if (nota<=3){
            System.out.println("Você precisa melhorar muito!");
        } else if(nota>3&&nota<=7){
            System.out.println("Você está quase conseguindo!");
        }else if(nota>=7&&nota<9){
            System.out.println("Você Conseguiu");
        }else if(nota>9){
            System.out.println("Você conseguiu com distinção");
                
                
                    
                    
        
    }
    }
    
}
