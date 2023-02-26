/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite aqui o nome do aluno");        
        String nome= leitor.nextLine();
        System.out.println("Digite aqui a nota do aluno");
        float nota=leitor.nextFloat();
        
        System.out.format("A nota de %s é  %.2f \n", nome,nota);
        
        
        
        
        
        
        
    }
    
}
