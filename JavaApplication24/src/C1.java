/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Deus
 */
public class C1 {

     public void imprime() {

         System.out.println("Construtor C1");

     }

}

//C2.java

public class C2 extends C1{

     public void imprime() {

         System.out.println("Construtor C2"); 

     }

}

//C3.java

public class C3 extends C2{

     public void imprime() {

         super.imprime();

         System.out.println("Construtor C3"); 

     }

}

//Teste.java

public class Teste {

     public static void main(String[] args) {

         C3 ex = new C3();

         ex.imprime();

     }


