/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication59;

/**
 *
 * @author Deus
 */
public class JavaApplication59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nomeAtleta="Bolt";
        double [] marca=new double[5];
        marca[0]=10.02;
        marca[1]=10.0;
        marca[2]=9.56;
        marca[3]=9.57;
        marca[4]=9.56;
        marca[5]=9.55;
        
        for(int i=0; i<5;i++){
            System.out.println("Marca"+marca);
           System.out.println("Tempo1"+marca[1]);
           System.out.println("Tempo2"+marca[2]);
           System.out.println("Tempo3"+marca[3]);
           System.out.println("Tempo4"+marca[4]);
           System.out.println("Tempo5"+marca[5]);
        }
               
    }
    
}
