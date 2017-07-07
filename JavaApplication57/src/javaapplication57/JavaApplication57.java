/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

/**
 *
 * @author Deus
 */
public class JavaApplication57 {
    public class A {

     public A() {

         System.out.println("Construtor A");

     }

}

public class B extends A{

     public B() {

         System.out.println("Construtor B");  

     }

}

public class C extends B {

     public C() {

         super();

         System.out.println("Construtor C");  

     }

}

public class D extends C {

     public D() {

         super();

         System.out.println("Construtor D");

     }

}

public class E extends D{

     E(){

         System.out.println("Construtor E");  

     }

    

 

     }




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
}


}
       