/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Deus
 */
public class Bola {

    static boolean finJuego;
    private int x;
    private int y;
    private int dx=1, dy=1;
    private final int ANCHO=15, ALTO=15;
    
    
    
    public Bola(int x, int y){
        this.x=x;
        this.y=y;
        
        
    }

    Bola() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Rectangle2D getBola(){
        return new Rectangle2D.Double(x,y,ANCHO,ALTO);
    }
    public void mover(Rectangle limites){
        x+=dx;
        y+=dy;
        
        if(x>limites.getMaxX()){
            dx=-dx;
            
        }
        if(y>limites.getMaxY()){
            dy=-dy;
        }
        if(x<0){
            dx=-dx;
        }
        if(y<0){
            dy=-dy;
        }
        
        
    }

    void moverbola(Rectangle bounds, boolean colision, boolean colision0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getShape() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getScore1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getScore2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
