/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Deus
 */
public class TabuleiroJogo extends JPanel {
  
    Raqueta r1 = new Raqueta(10, 200);
    Raqueta r2 = new Raqueta(794 - 10 - Raqueta.ANCHO, 200);
  Bola p = new Bola();

    public TabuleiroJogo() {
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(Color.WHITE);
        dibujarPuntaje(g2);
        dibujar(g2);

    }

    private void dibujar(Graphics2D g) {
        Line2D.Double linea = new Line2D.Double(getBounds().getCenterX(), 0, getBounds().getCenterX(), getBounds().getMaxY());

        g.draw(linea);

        g.fill(r1.getRaqueta());
        update();

        g.fill(r2.getRaqueta());
        update();

        g.fill((Shape) p.getShape());
        update();
    }

//actualiza el estado (posicion) de las raquetas y pelota
    private void update() {

      

        r1.moverR1(getBounds());
        r2.moverR2(getBounds());
    }

    //detecta si existe una colision entre la raqueta y la pelota
   
    

    private void dibujarPuntaje(Graphics2D g) {
        Graphics2D g1 = g, g2 = g;
        Font score = new Font("Arial", Font.BOLD, 30);
        g.setFont(score);

        g1.drawString(Integer.toString(p.getScore1()), (float) getBounds().getCenterX() - 50, 30);
        g2.drawString(Integer.toString(p.getScore2()), (float) getBounds().getCenterX() + 25, 30);
        if (p.getScore1() == 5) {
            g.drawString("GANÓ El JUGADOR 1", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Bola.finJuego = true;
        }
        if (p.getScore2() == 5) {
            g.drawString("GANÓ EL JUGADOR 2", (float) getBounds().getCenterX() - 180, (float) getBounds().getCenterY() - 100);
            Bola.finJuego = true;
        }
    }

}
    
