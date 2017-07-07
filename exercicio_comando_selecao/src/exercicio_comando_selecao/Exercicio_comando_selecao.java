/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_comando_selecao;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Exercicio_comando_selecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1,numero2;
        float resultado ;
        int opcao;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Insira aqui um número");
        numero1=leitor.nextInt();
        System.out.println("Insira aqui outro número");
        numero2=leitor.nextInt();
        System.out.println("1-Soma\n2-sub\n3-div\n4-mult");
        opcao=leitor.nextInt();
        
        if(opcao==1){
            resultado=numero1+numero2;
            System.out.println("O resultado da soma foi"+resultado);
        }else if(opcao==2){
            resultado=numero1-numero2;
            System.out.println("Resultado da subtração foi"+resultado);
            
        } else if(opcao==3){
            resultado=numero1/numero2;
            System.out.println("O resultado da divisão"+resultado);
            
        } else if(opcao==4){
            resultado=numero1*numero2;
            System.out.println("o resultado da multiplicação foi"+resultado);
        }
        else{
            System.out.println("opção inválida");
        }
        
    }
    
}
