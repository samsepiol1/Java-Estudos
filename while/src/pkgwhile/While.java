/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int i; 
        int soma=0;
                
             Scanner leitor=new Scanner(System.in);
             do{
                 for(i=1;i<=10;i++){
                 System.out.println("Digite aqui um número");
                 numero=leitor.nextInt();
                 soma=numero+soma;
                 
                 
                 }
                 
             }while(i<=10);
     System.out.println(soma);         
    }
   
    
}
