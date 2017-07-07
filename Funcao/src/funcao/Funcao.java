/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Funcao {

    /**
     * @param args the command line arguments
     */
    static int somatoria(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor= new Scanner(System.in);
        
        int a,b,c,soma;
        
        System.out.println("Coloque aqui o valor do primeiro numero");
        
        a=leitor.nextInt();
        System.out.println("Coloque aqui o valor do segundo numero");
        b=leitor.nextInt();
        System.out.println("Coloque aqui o valor do terceiro numero");
        c=leitor.nextInt();
        
        soma=somatoria(a,b,c);
        
        System.out.println("O resultado da soma é"+soma);
        
        
        
    }
    
}
