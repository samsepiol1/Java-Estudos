/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubuada;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Tubuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int mult;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite um número aqui");
        numero=leitor.nextInt();
        
        
        for(int i=0;i<=10;i++){
            mult=numero*i;
            System.out.println(String.format("%d X %d = %d",numero,i,mult));
            
            
        }
    }
    
}
