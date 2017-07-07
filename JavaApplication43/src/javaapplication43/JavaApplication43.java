/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication43;

/**
 *
 * @author Deus
 */
import java.util.Scanner;

public class JavaApplication43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        System.out.println("digite um número");
        int numero=leitor.nextInt();
        int fat=fatorial(numero);
        if(fat>0){
            System.out.println("o fatorial desse numero é igual a "+fat);
        }else{
            System.out.println("Não existe fatorial de numero negativo");
            
        }
    }
    
                public static int fatorial(int numero){
                    int fat;
                    if(numero<0){
                        fat=-1;
                    }else if (numero==0){
                                fat=1;
                    }else{
                        fat=1;
                        for(int i=2;i<=numero;i++){
                            fat=fat*i;
                            
                        }
                    }
                        return fat;
                    }
                
}
                


    
    

