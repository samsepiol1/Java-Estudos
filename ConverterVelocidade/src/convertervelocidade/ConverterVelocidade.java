/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertervelocidade;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class ConverterVelocidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int km;
        int ms;
        int resultado_km;
        int resultado_ms;
        
        Scanner leitor=new Scanner(System.in);
        System.out.println("Coloque aqui o numero em km");
        km=leitor.nextInt();
        System.out.println("Coloque aqui o numero em ms");
        ms=leitor.nextInt();
        resultado_km=(int) (ms/3.6);
        resultado_ms=(int) (km*3.6);
        
        System.out.println("O resultado em km é "+resultado_km);
        
        System.out.println("o resultado em ms "+resultado_ms);
        
        
        
    }
    
}
