/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java101;
import java.util.Scanner;

/**
 *
 * @author Deus
 */
public class Java_Vector {
    public static void main(String args[]){
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite a quantidade de valores:");
        int valores[]=new int[leitor.nextInt()];
        System.out.println("Digite agora os valores:");
        for(int i=1; i<valores.length;i++){
            valores[i]=leitor.nextInt();
        }
        System.out.println("Valores digitados");
        for(int i=0; i<valores.length;i++){
            System.out.println(valores[i]);
        }
                
        
    }
}
