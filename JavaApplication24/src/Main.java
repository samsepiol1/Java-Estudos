/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deus
 */

public class Main {
	public static void main (String[] args){
             //aqui estará todo o código responsável por executar o programa:
		//1- Criação de objetos
		//2- Manipulação dos seus dados
		//3- Finalização do programa
                System.out.println("Meu primeiro programa java");

		Carro meuCarro = new Carro();
		meuCarro.setCor("preto");
		meuCarro.setNumPortas(4);
		
		meuCarro.setTipo("esportivo");

		System.out.println("Cor: "+meuCarro.getCor());
		System.out.println("Número de portas: "+meuCarro.getNumeroPortas());
		System.out.println("Placa: "+meuCarro.getPlaca());
		System.out.println("Tipo: "+meuCarro.getTipo());
        }

    private static class Carro {

        public Carro() {
        }

        private void setCor(String preto) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setNumPortas(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setTipo(String esportivo) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getCor() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getNumeroPortas() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getPlaca() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getTipo() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}

                        

