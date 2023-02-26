/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package riddled;

/**
 *
 * @author Deus
 */
public class Charadas {
    String charada1;
    String charada2;
    String charada3;

    public Charadas(String charada1, String charada2, String charada3) {
        System.out.println("O que é preto e depois vermelho ?");
        System.out.println("O quanto mais de perde mais se ganha");
        System.out.println("o que é o inicio do inicio");
        
        this.charada1 = charada1;
        this.charada2 = charada2;
        this.charada3 = charada3;
    }

    Charadas() {
        System.out.println("o que é preto e depois vermelho?");
        System.out.println("Quanto mais se perde mais se ganha");
        System.out.println("o que é o inicio do inicio");
        
    }

    public String getCharada1() {
        return charada1;
    }

    public void setCharada1(String charada1) {
        this.charada1 = charada1;
    }

    public String getCharada2() {
        return charada2;
    }

    public void setCharada2(String charada2) {
        this.charada2 = charada2;
    }

    public String getCharada3() {
        return charada3;
    }

    public void setCharada3(String charada3) {
        this.charada3 = charada3;
    }
    
    
}
