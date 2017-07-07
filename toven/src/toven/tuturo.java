
package toven;


public class tuturo {
    String modelo;
    String liga;
    String desliga;
    int velocidade;
    void status_ligado(){
        System.out.println("ventilador ligado"+this.liga);
        System.out.println("modelo eletrolux"+this.modelo);
        System.out.println("estado de velocidade"+this.velocidade);
    }
    void status_desligado(){
        System.out.println("modelo eletrolux"+this.modelo);
        System.out.println("Ventilidor desligado"+this.desliga);
        System.out.println("estado de velocidade"+this.velocidade);
        
        
    }
    
    
}
