/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication93;

/**
 *
 * @author Deus
 */
public class Pilha {
    static final int MAX=1000;
    int top;
    int a[]=new int[MAX];
    
    //Construtor
    Pilha(){
        top=-1
    }
    // Métodos da Pilha
    boolean isEmpty(){
        return(top < 0);
    }
    boolean push(int x){
        if(top>=(MAX-1)){
            System.out.println("Estouro de Pilha!!");
            return false;
        }
        else{
            a[top++]=x;
            return true;
        }
        
    }
    int pop(){
        if(top<0){
            System.out.println("Pilha Está Vazia!");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    int peek(){
        if(top<0){
            System.out.println("Pilha Vazia");
            return 0;
        }
        else{
            return a[top];
        }
    }
    }
}
     
             
             
        
    
           
            
    

