/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nome_vetor;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Nome_vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner leitor=new Scanner (System.in);
        System.out.println("Digite aqui a sua idade:");
        int idade=leitor.nextInt();
        int idades[]=new int[idade];
        idades[1]=19;
        System.out.println("A sua idade é de:"+idades[1]);
        for(int i=1; i<=10;i++){
           idades[i]=i;
        }
        System.out.println(idades);
        
     
    }
    
}
