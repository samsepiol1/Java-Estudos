
package aula12;

public class Ave extends Animal {
    private String corPena;

    
    public void locomover() {
        System.out.println("Voando");

    }

    
    public void alimentar() {
        System.out.println("Comendo frutas");
      
    }

    
    public void emitirSom() {
        System.out.println("Som de ave");
        
        
    }
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}

