/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shinigami_eyes;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Shinigami_eyes {

    /**
     * @param args the command line arguments
   */
    public static void main(String[] args) {
        // TODO code application logic here
        float dias_shinigami=(float) 3.55;
        float resultado;
        int anos;
        int dias=365;
         float resultado_shinigami;
        
        
        
        
        Scanner leitor=new Scanner(System.in);
        System.out.println("Quantos anos você tem ? ");
          anos=leitor.nextInt();
          resultado=dias*anos;
          System.out.println("Você viveu até agora:"+resultado);
          
          resultado_shinigami=dias_shinigami/resultado;
          
          System.out.println("De acordo com Ryuk, no mundo dos shinigamis, você teria"+resultado_shinigami);
          
          
          
          
          
        
        
        
        
        
    }
    
}
