
package aula12;

public class Reptil extends Animal {
    private String corEscama;

    
    public void locomover() {
        System.out.println("Rastejando");
   
    }

    
    public void alimentar() {
        System.out.println("Comendo vegetais");

    }

    
    public void emitirSom() {
        System.out.println("Emitindo som de reptil");
        
     
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}

