/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betanotas;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class BetaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

float nf;
float nf2;

        
       Scanner leitor=new Scanner(System.in);
        System.out.println("Digite aqui a nota da sua pariticipação total");
        float pt=leitor.nextFloat();
        System.out.println("Digite aqui a nota das suas atividades executadas");
        float ae=leitor.nextFloat();
        System.out.println("Digite aqui a nota das suas provas escritas");
        float pe=leitor.nextFloat();
        nf=pt+ae+(pe*2);
        nf2=nf/4;
        System.out.printf("A sua nota final foi igual a %.2f ",nf2);
        
        
        
        
        
    }
    
}
