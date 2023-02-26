
package javaapplication97;
import java.util.Calendar;
public class Testa_date {
    
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println("Data e Hora Atual:"+c.getTime());
        System.out.println("Ano: "+c.get(Calendar.YEAR));
        System.out.println("Mês: "+c.get(Calendar.MONTH));
        System.out.println("Dia: "+c.get(Calendar.DAY_OF_MONTH));
    }
}
