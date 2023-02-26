/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deus
 */
public class NewClass {
   
String tipo;
	String cor;
	String placa;
	int numPortas;

	void setCor(String c){
		cor = c;
	}		
	
	String getCor(){
		return cor;
	}

	String getTipo(){
		return tipo;
	}

	void setTipo(String tipo){
		this.tipo = tipo;
	}

	String getPlaca(){
		return placa;
	}
	
	void setPlaca(String placa){
		this.placa = placa;
	}

	int getNumPortas(){
		return numPortas;
	}
	void setNumPortas(int  numPortas){
		this.numPortas = numPortas;
	}

    private static class Carro {

        public Carro() {
        }
    }
}
