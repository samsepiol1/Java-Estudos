/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Deus
 */

public class Hilo extends Thread {

    private final TabuleiroJogo lamina;
 
    public Hilo(TabuleiroJogo lamina) {
        this.lamina = lamina;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            lamina.repaint();
          
        }
    }
}