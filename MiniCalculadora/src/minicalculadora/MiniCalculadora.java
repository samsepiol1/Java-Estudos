/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minicalculadora;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class MiniCalculadora {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int soma;
        int sub;
        int A;
        int B;
        int receber;
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite 1 para somar e 2 para subtrair 3 ");
        receber=leitor.nextInt();
        System.out.println("digite aqui o primeiro numero");
        A=leitor.nextInt();
        System.out.println("digite aqui o segundo numero");
        B=leitor.nextInt();
        soma=A+B;
        sub=A-B;
        if(receber==1){
            System.out.println(soma);
        }else{
            System.out.println(sub);
            
            
        }
        
        
        
        
    }
    
}
