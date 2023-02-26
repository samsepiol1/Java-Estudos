
package aula05;


public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Conta"+this.getNumConta());
        System.out.println("Tipo"+this.getTipo());
        System.out.println("Dono"+this.dono);
        System.out.println("Saldo"+this.saldo);
        System.out.println("Status"+this.status);
        
                
    }
    
    public void AbrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC") {
           
            this.setSaldo(50);
            
        } else if (t=="CP"){
           this.setSaldo(150);
            
            
        }
        
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta não pode ser fechada porque ser fechada");
        }else if(this.getSaldo()<0){
            System.out.println("Conta não pode ser fechada porque tem debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada");
            
            
        }
        
    }
    public void depositar(float v){
        if(this.status==true){
            this.saldo=this.saldo+v;
            System.out.println("Depoisito realizado com sucesso");
        }else{
            System.out.println("IMpossivél depositar em uma conta fechada");
            
            
            
        }
    }
    public void sacar(float v ){
        if(this.getStatus()){
            if(this.getSaldo()>v){
                System.out.println("Saldo realizado");
            }else{
                System.out.println("Saque impossivél de realizar");
            
                    
                
                
            }
        }else{
            System.out.println("Saque impossivel de realizar porque a conta está fechada");
        }
        
    }
            
    public void pagarMensal(){
        int v;
        if(this.getTipo()=="CC"){
            v=12;
        }else if (this.getTipo()=="CP"){
            v=20;
            if(this.getStatus()){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Mensalidade paga com sucesso");
                
            }
            
        }
        
    }
    //especiais
    public ContaBanco(){
        this.saldo=0;
        this.status=false;
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
