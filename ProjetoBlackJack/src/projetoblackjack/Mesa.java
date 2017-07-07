/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoblackjack;

import java.util.logging.Logger;

/**
 *
 * @author Deus
 */
public class Mesa {
     private String jogador1;
     private String jogador2;

    public Mesa(String jogador1, String jogador2) {
        System.out.println("Maria");
        System.out.println("João");
        
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        
    }

    public String getJogador1() {
        return jogador1;
    }

    public void setJogador1(String jogador1) {
        this.jogador1 = jogador1;
    }

    public String getJogador2() {
        return jogador2;
    }

    public void setJogador2(String jogador2) {
        this.jogador2 = jogador2;
    }
    

   

   
    
    
}
