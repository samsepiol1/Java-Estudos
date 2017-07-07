/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
           int dia;
        int mes;
        int ano;
        char formato;
       
       
        System.out.println("coloque  aqui a dia do seu nascimento");
        dia=leitor.nextInt();
        System.out.println("coloque  aqui o mes do seu nascimento");
        mes=leitor.nextInt();
        System.out.println("coloque aqui o ano do seu nascimento");
        ano=leitor.nextInt();
        System.out.println("a-dia b-mes c-ano d-dia/mes/ano 0-sair do programa");
        formato= leitor.nextLine().charAt(0);
        
        
        
        switch (formato){
            case 'A':
                System.out.println(dia);
              dia=leitor.nextInt();
              break;
             
            case 'B':
             System.out.println(mes);
             mes=leitor.nextInt();
               break;
             
            case'C':
               System.out.println(ano);
                ano=leitor.nextInt();
                  break;
                
            case 'D' :
                System.out.println(dia);
                System.out.println("/");
                System.out.println(mes);
                System.out.println("/");
                System.out.println(ano);
                break;
            
              
                
                    
            
            
        }
        
        
        
    }
    
}
