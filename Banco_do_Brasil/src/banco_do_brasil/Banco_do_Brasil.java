/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco_do_brasil;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class Banco_do_Brasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        double saldo_disponivel=1000;
        double valor_do_saque=0;
        System.out.println("Informe o valor do saque:");
        valor_do_saque=leitor.nextDouble();
        if(valor_do_saque<=saldo_disponivel){
            System.out.println("R$ SACANDO...");
            
        }
        else{
            System.out.println("O valor não está disponível");
        }
        System.out.println("Realizando saque"+saldo_disponivel);
        
    }
    
}
