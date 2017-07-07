/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deus
 */
public class Carro1 {
    String cor;
    String tipo;
    String placa;
    int numPortas;
    void Setcor(String cor){
        this.cor=cor;           
    }
    String getCor(){
        return this.cor;
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
	void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}
}

