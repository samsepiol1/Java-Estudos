/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Deus
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero n=new Mamifero();
        Ave a=new Ave();
        Reptil r=new Reptil();
        
        Peixe p=new Peixe();
        Canguru c=new Canguru();
        Goldsifh g=new Goldsifh();
        Cachorro k=new Cachorro();
        Arara b=new Arara();
        Cobra j=new Cobra();
        
        
        
      
        c.locomover();
        k.locomover();
        k.emitirSom();
    }
    
}
