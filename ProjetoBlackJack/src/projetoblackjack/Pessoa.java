/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoblackjack;

/**
 *
 * @author Deus
 */
public class Pessoa  extends Humano{
    private String estado;
    private String nacionalidade;
    private double cpf;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
    
    
}
