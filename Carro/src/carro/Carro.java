/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Deus
 */
public class Carro {

    /**
     * @param args the command line arguments
     */
    String Cor;
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Meu primeiro aplicativo java");
        Carro meuCarro= new Carro();
        meuCarro.setCor("preto");
        
        
    }

    private void setCor(String preto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
