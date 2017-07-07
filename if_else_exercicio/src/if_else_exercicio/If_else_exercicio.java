/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else_exercicio;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class If_else_exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Insira o dia do seu nascimento");
        int dia=leitor.nextInt();
        System.out.println("Insira o mês do seu nascimento");
        int mes=leitor.nextInt();
        System.out.println("Insira o ano do seu nascimento");
        int ano=leitor.nextInt();
        
        System.out.println("1-DD/MM/AA\n2-AA/MM/DD\n3-MM/DD/AA");
        opcao=leitor.nextInt();
        
        if(opcao==1){
             System.out.println(dia+"/"+mes+"/"+ano);
        } else if(opcao==2){
             System.out.println(ano+"/"+mes+"/"+dia);
            
        } else if(opcao==3){
             System.out.println(mes+"/"+dia+"/"+ano);
            
        }
        else{
            System.out.println("Opção não cadastrada");
        }
        
        
    }
    
}
