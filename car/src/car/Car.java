/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author Deus
 */
public class Car {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        carclas meuCarro=new carclas();
         carclas.setcor("Preto");
       
		meuCarro.setCor("preto");
		meuCarro.setNumPortas(4);
		meuCarro.setTipo("esportivo");

		System.out.println("Cor: "+meuCarro.getCor());
		System.out.println("Número de portas: "+meuCarro.getNumPortas());
		System.out.println("Placa: "+meuCarro.getPlaca());
		System.out.println("Tipo: "+meuCarro.getTipo());

         
      
    }
    
}
