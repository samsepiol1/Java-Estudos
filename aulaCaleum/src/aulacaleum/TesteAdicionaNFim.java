/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacaleum;

/**
 *
 * @author Deus
 */
public class TesteAdicionaNFim {
    public static void main(String args[]){
        
        Aluno a1=new Aluno();
        Aluno a2=new Aluno();
       
        
        a1.setNome("Rafael");
        a2.setNome("Ricardo");
       
        
        Vetor lista=new Vetor();
        
        lista.adiciona(a1);
        lista.adiciona(a2);
        
        System.out.println(lista);
        
        
        
        
        
        
              
        
        
        
    }
    
}
