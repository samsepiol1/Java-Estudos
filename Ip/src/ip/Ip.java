/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ip;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Ip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero_usuario;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite 1-Para ip Classe a 2- para classe b e 3-para classe C");
        numero_usuario=leitor.nextInt();
        switch(numero_usuario){
            case 1:
                System.out.println("100.0.0.0");
                break;
            case 2:
                System.out.println("172.16.0.0");
                break;
            case 3:
                System.out.println("192.168.0.0");
                break;
            default:
                System.out.println("Não existe esse ip no nosso banco de dados");
                
                
                
                
        }
            
                
        
    }
    
}
