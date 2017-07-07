/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notafinal;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class NotaFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float pt;
        float ae;
        float pe;
        float nf;
        float nf2;
       
        
        
        Scanner leitor=new Scanner(System.in);
      
        System.out.println("digite aqui a sua nota da participação total");
        pt=leitor.nextFloat();
        System.out.println("digite aqui a nota dos questionarios semanais");
        ae=leitor.nextFloat();
        System.out.println("digite aqui a sua nota da prova escrita");
        pe=leitor.nextFloat();
        nf=pt+ae+(pe*2);
        nf2=nf/4;
        System.out.println("a sua nota final no IMD-UFRN foi"+nf2);
        System.out.println("obrigado por usar nossos serviços"); 
        
        
    }
    
}
