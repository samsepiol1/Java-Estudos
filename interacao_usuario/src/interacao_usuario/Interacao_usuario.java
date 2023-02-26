/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacao_usuario;
import java.util.Calendar;

/**
 *
 * @author Deus
 */
public class Interacao_usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c1=Calendar.getInstance();
        int hora=c1.get(Calendar.HOUR_OF_DAY);
        if(hora>6 && hora<12){
            System.out.println("Bom dia!");
        }else if(hora>12&&hora<18){
            System.out.println("Boa Tarde!");
        }else{
            System.out.println("Boa Noite!");
        }
        
    }
    
}
