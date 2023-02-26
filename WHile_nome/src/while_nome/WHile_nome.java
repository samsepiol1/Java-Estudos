/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_nome;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class WHile_nome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome;
        int controle;
        boolean teste_logico;
        teste_logico=true;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite aqui um nome");
        nome=leitor.nextLine();
        
      
        
        while(teste_logico==true){
            System.out.println(nome);
        }
        
    }
    
}
