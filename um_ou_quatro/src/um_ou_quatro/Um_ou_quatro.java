/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package um_ou_quatro;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Um_ou_quatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número de 1 a 4");
        numero=leitor.nextInt();
        do{
            System.out.println("Número inválido");
            System.out.println("Digite um número de 1 a 4");
            numero=leitor.nextInt();
        }while(numero>4);
        if(numero<=4){
            System.out.println("Número digitado"+numero);
        }
            
            
        
    }
    
}
