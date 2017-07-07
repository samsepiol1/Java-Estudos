/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Deus
 */
public class Cachorro  extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Au!au!au!");
    }
    public void Reagir(String frase){
        if(frase=="Toma comida"){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Rosnar");
            
        
        }
        
    }
    public void Reagir(int hora,int mim){
        if(hora<12){
            System.out.println("Abanar o rabo");
        }else if (hora>=18){
            System.out.println("Abanar");
        }else{
            System.out.println("Abanar e latir");
            
            
        }
        
    }
    public void Reagir(boolean dono){
        if(dono==true){
            System.out.println("ABANAR RABO DESCONTROLADAMENTE");
        }else{
            System.out.println("Latir e rosnar");
            
        }
        
    }
    public void Reagir(int idade,float peso){
        if (idade<5) {
            if (peso<10) {
                System.out.println("Abanar");
                
            } else {
                System.out.println("Latir");
            }
            
            
            
        } else {
        }
  
        
         
    }  
    
    
   
      

}
