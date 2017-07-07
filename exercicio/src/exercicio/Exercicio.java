/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Qual o dia do seu nascimento");
        int dia=leitor.nextInt();
        System.out.println("Insira o seu mês de nascimento");
        int mes=leitor.nextInt();
        System.out.println("Insira o ano do seu nascimento");
        int ano=leitor.nextInt();
        
        System.out.println("1-DD/MM/AA\n2-AA/MM/DD\n3-MM/DD/AA");
        opcao=leitor.nextInt();
        
        switch (opcao){
                case 1:
                    System.out.println(dia+"/"+mes+"/"+ano);
                    break;
                case 2:
                    System.out.println(ano+"/"+mes+"/"+dia);
                    break;
                case 3:
                    System.out.println(mes+"/"+dia+"/"+ano);
                    break;
                default:
                    System.out.println("Opcao não existe");
        }
                  
                    
        
        
        
        
    }
    
}
