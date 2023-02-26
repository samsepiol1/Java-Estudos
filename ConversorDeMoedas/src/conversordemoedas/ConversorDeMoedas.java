/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordemoedas;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class ConversorDeMoedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float moeda;
        float dolar=3.75f;
        float euro=4.28f;
        float bitcoin=20.446f;
         float resultado_dolar;
         float resultado_euro;
         float resultado_bitcoin;
                
        Scanner leitor=new Scanner(System.in);
        System.out.println("Quanto de dinehiro em reais você tem? ");
        moeda=leitor.nextFloat();
        resultado_dolar=moeda/dolar;
                resultado_bitcoin=moeda/bitcoin;
                resultado_euro=moeda/euro;
                System.out.printf("em dolar você possui %.2f \n",resultado_dolar);
                System.out.printf("em euro você possui %.2f\n",resultado_euro);
                System.out.printf("em bitcoin você possui %.2f\n",resultado_bitcoin);
                
        
    }
    
}
