
package aula12;

public class Peixe  extends Animal{
private String corEscama;

    
    public void locomover() {
        System.out.println("Nadando");
    }

    
    public void alimentar() {
      System.out.println("Comendo substancias");
    }

   
    public void emitirSom() {
        System.out.println("Peixe não emite som");
     
    }
    public void soltarBolha(){
        System.out.println("Soltando bolha");
        
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
