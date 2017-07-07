/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deus
 */
public class Teste {
 	public static void main(String[] args){
	/*aqui estará todo o código responsável por executar o programa:
		*1- Criação de objetos
		*2 - Manipulação de seus dados
		*3- Finalização do programa
		*/

		System.out.println("Meu primeiro programa java");

		Carro meuCarro = new Carro();
		meuCarro.setCor("preto");
		meuCarro.setNumPortas(4);
		meuCarro.setPlaca("MHX 1234"); 
		meuCarro.setTipo("esportivo");

		System.out.println("Cor: "+meuCarro.getCor());
		System.out.println("Número de portas: "+meuCarro.getNumeroPortas());
		System.out.println("Placa: "+meuCarro.getPlaca());
		System.out.println("Tipo: "+meuCarro.getTipo());

	}

}