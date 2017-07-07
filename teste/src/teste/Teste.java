
package teste;


import java.util.Scanner;

public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int idade,nasc;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento");
        nasc=leitor.nextInt();
        idade=2019-nasc;
        if(idade>=18){
            System.out.println("MAIOR!");
            
        }
        else{
            System.out.println("MENOR!");
        }
        
        
       
               
        
        
        
        
        
        
        
        
    }
    
}
