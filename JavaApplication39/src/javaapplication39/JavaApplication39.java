/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication39;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 *
 * @author Deus
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Timer timer = null;      
        final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        if (timer == null)   
         {      
             timer = new Timer();  
            TimerTask tarefa = new TimerTask() {     
                 public void run()   
                 {      
                     try {      
                         System.out.println("Hora: "+format.format(new Date().getTime()));      
                   } catch (Exception e) {      
                         e.printStackTrace();      
                     }      
                }   
             };      
            timer.scheduleAtFixedRate(tarefa, 0, 1000);      
        }    
    }
    }
    

