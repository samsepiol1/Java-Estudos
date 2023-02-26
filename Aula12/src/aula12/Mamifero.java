package aula12;

public class Mamifero extends Animal {
    private String corPelo;

    
    public void locomover() {
        System.out.println("Correndo");
       
    }

    
    public void alimentar() {
    System.out.println("Mamando");
    }

    
    public void emitirSom() {
        System.out.println("Som de mamifero");
        
     
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}