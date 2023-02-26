/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_else;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class If_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero,numero2;
		Scanner leitor = new Scanner(System.in);
		System.out.println ("Digite um numero: ");
		numero=leitor.nextInt();
                System.out.println("Digite um outro número");
                numero2=leitor.nextInt();
                if(numero>numero2){
                    System.out.println("O primeiro número digitado é maior do que o segundo");
                    System.out.println(numero+">"+numero2);
                } else if(numero2>numero){
                    System.out.println("O segundo número digitado é maior do que o primeiro");
                    System.out.println(numero2+">"+numero);
                }else if(numero==numero2){
                    System.out.println("Numero iguais!");
                    System.out.println(numero+"="+numero2);
                }
}
}   

