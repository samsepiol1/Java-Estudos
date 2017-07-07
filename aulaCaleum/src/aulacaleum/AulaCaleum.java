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
public class AulaCaleum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Testar métodos
        
        //Criando Alunos
        Aluno a1=new Aluno();
        Aluno a2=new Aluno();
        Aluno a3=new Aluno();
        //Setando Valores
        a1.setNome("Lucas");
        a2.setNome("Maria");
        a3.setNome("Paulo");
        //Inicializando Vetor Para armazenar
        Vetor lista=new Vetor();
        //Adicionar Alunos ao Vetor
        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3);
        
        //Imprimindo lista
        System.out.println(lista);
        
        //Adiciona em uma dada posição
        
        lista.adiciona(0,a1);
        lista.adiciona(2,a3);
        
        // Pega um Aluno em determinada posição
        Aluno aluno1=lista.pega(0);
        Aluno aluno2=lista.pega(1);
        Aluno aluno3=lista.pega(2);
        
        //Imprimir Lista
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        
        // Removendo em uma Posição
        lista.remove(0);
        
        // Verifica se tem um aluno na lista
        System.out.println(lista.contem(a1));
        System.out.println(lista.contem(a2));
        System.out.println(lista.contem(a3));
        
        Aluno aluno=new Aluno();
        aluno.setNome("Ana");
        
        System.out.println(lista.contem(aluno));
        
        //Informar o Tamanho da Lista
        System.out.println(lista.tamanho());
        
        
        
        
        
        
        
        
    }
    
}

