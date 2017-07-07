/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohumano;

/**
 *
 * @author Deus
 */
public class Pessoa {
    private int idade;
    private String nome;
    private float altura;
    private int data;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float Altura) {
        this.altura = Altura;
    }
    public void setNome(int pessoa){
        this.nome=nome;
    }
    public String getNome(){
        
   return this.nome=nome;
   
    
}
    public void setData(int data){
        this.data=data;
    }
    public int getData(){
         return this.data=data;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void exibirDados(){
       System.out.println("1,80"+this.getAltura());
       System.out.println("nome:Lucas"+this.getNome());
       System.out.println("17/02/2000"+this.getData());
       System.out.println("18 anos"+this.getIdade());
    
}
    
    
}
