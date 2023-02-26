/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int riddle1;
        int riddle2;
        int riddle3;
        int riddled2;
        int riddled3=0;
        
        int riddled1;
        Scanner leitor=new Scanner(System.in);
        System.out.println("bem vindo a fabrica do charada, você está pronto ?");
        System.out.println("pressione 1 para a primeira charada");
        riddle1=leitor.nextInt();
        if(riddle1==1){
            System.out.println("o que é seu mais os outros usam mais do que você?"
                   +"1-Seu nome"
                    + "2-sua idade"
                    + "3-seu cerebro");
            riddled1=leitor.nextInt();
             
                System.out.println("o que é verde e depois vermelho?"
                        + "1-um sapo no liquidificador"
                        + "2-uma ram no liquidificador"
                        + "um humano no ventilador");
                riddle2=leitor.nextInt();
                System.out.println("o que é vermelho depois preto?"
                +"0-o fosforo"
                +"2-as cinzas"
                +"1-uma palito");
                riddled3=leitor.nextInt();
            if(riddled1==1){
                System.out.println("Correto!");
            }else{
                System.out.println("Você é um animal");
               
                if(riddle2==1){
                    
                    System.out.println("Correto,estas a um passo perto de mim");
                }else{
                    System.out.println("seu burro!");
                    
                    
                    if(riddled3==1){
                        System.out.println("correto!");
                    }else{
                        System.out.println("incorreto!");
                        
                        
                        
                    }
                    
                    
                }
                
            
        }
            

        
            
            
        }
    }
    
}
