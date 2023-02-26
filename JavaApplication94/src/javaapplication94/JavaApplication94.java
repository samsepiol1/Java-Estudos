package javaapplication94;
import java.util.Scanner;
public class JavaApplication94 {

    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Entre com um Número:");
        int valor=entrada.nextInt();
       
        Pilha2 novaPilha=new Pilha2();
        novaPilha.push(valor);
        novaPilha.push(21);
        novaPilha.push(22);
        novaPilha.push(23);
        
        System.out.println("Item de Valor" + novaPilha.pop() + "Retirado da Pilha");
        System.out.println("Item Restante:"+novaPilha.peek());
        System.out.println("");
        
        
                
    }
    
}
