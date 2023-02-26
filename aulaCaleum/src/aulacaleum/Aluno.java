/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulacaleum;

/**
 *
 * @author Deus
 */
//Classe Aluno
class Aluno {
    //Criando Variavel Privada Nome
    private String nome;
    // Metodo Para Retornar o Nome do Aluno
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String toString(){
        return this.nome;
    }
    public boolean equals(Object o){
        Aluno outro=(Aluno)o;
        return this.nome.equals(outro.nome);
    }
    // Função para lista
    public class AlunoLista{
        private String nome;
        private int idade;
        private AlunoLista proximo;
    }
    // Função Celula para melhorar a lista
    public class Celula{
        private Celula proxima;
        
        private Object elemento;
        
        public Celula(Celula proxima, Object elemento){
            this.proxima=proxima;
            this.elemento=elemento;
        }
        
        public Celula(Object elemento){
            this.elemento=elemento;   
        }
        
        public void setProxima(Celula proxima){
            this.proxima=proxima;
        }
        
        public Celula getProxima(){
            return proxima;
        }
        
        public Object getElemento(){
            return elemento;
        }
        public class ListaLigada{
            private Celula primeira;
            private Celula ultima;
            
            public void adiciona(Object elemento){}
            public void adiciona(int posicao,Object elemento){}
            public void adicionaNoComeco(Object elemento){}
            public void removeDoComeco(){}
            public void removeDoFim(){}
            public Object pega(int posicao){return null;}
            public void remove(int posicao){}
            public int tamanho(){return 0;}
            public boolean contem(Object o){return false;}
        }
        
    }
    
    
}
