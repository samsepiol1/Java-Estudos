
package aula02;


public class Caneta {
    public String modelo;
    public String cor;
   public float ponta;
    protected int carga;
     private boolean tampada;
   public void status(){
        System.out.println("Modelo"+this.modelo);
        System.out.println("ponta:"+this.ponta);
        System.out.println("carga"+this.carga);
        System.out.println("Uma Caneta"+this.cor);
        System.out.println("Está tampada? "+this.tampada);
    }
    
   public void rabiscar(){
        if(this.tampada==true){
            System.out.println("Erro!! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
        
    }
    public void tampar(){
        this.tampada=true;
        
    }
    public void destampar(){
        this.tampada=false;
        
    }
    
}
