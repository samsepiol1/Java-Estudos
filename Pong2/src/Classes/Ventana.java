/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JFrame;

/**
 *
 * @author Deus
 */
public class Ventana extends JFrame {
      private final int ANCHO = 800, ALTO = 500;
    private TabuleiroJogo lamina;
    private Hilo hilo;
    public Ventana() {
        setTitle("Pong");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null); //ubicando la ventana en el centro de la pantalla
        setResizable(false);
        lamina = new TabuleiroJogo();
        addKeyListener(new EventoTeclado()); 
        add(lamina);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hilo=new Hilo(lamina);
        hilo.start();
        
    }
}


        
       
      
        
        
        
        
        
        
        
        
    

    


