/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_pais;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Programa_pais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("A letra inicial de um país");
        char pais= leitor.nextLine().charAt(0);
        
        switch(pais){
            case 'A':
                System.out.println("Alemanha");
                break;
            case 'B':
                System.out.println("Brasil");
                break;
            case 'C':
                System.out.println("Canada");
                break;
            default:
                System.out.println("Pais não existe no nosso banco de dados");
        }
    }
    
}
