/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Deus
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, float ponta, boolean tampada, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}