/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testa_metodos;
import java.util.Calendar;
/**
 *
 * @author Deus
 */
public class Testa_metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,1995);
        c.set(Calendar.MONTH,Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH,20);
        System.out.println("Data/Hora atual:"+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês:"+c.get(Calendar.MONTH));
        System.out.println("Dia:"+c.get(Calendar.DAY_OF_MONTH));
        
        
    }
    
}
