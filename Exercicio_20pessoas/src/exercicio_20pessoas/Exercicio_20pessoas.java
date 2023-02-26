/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_20pessoas;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Exercicio_20pessoas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int soma=0;
        int i;
        Scanner leitor=new Scanner(System.in);
        do{
            for(i=1;i<=20;i++){
                System.out.println("Digite a idade aqui");
                numero=leitor.nextInt();
                soma=soma+numero;
                
            }
        }while(i<=20);
        System.out.println("A soma das idades é de"+soma);
    }
    
}
