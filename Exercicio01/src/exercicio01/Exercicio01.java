package exercicio01;

import java.util.Scanner;
public class Exercicio01 {

  
    public static void main(String[] args) {
        String palavra;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Digite aqui uma palavra:");
        palavra=leitor.nextLine();
        System.out.println(palavra.length());
        
    }
    
}
