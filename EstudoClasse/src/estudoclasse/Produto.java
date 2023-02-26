package estudoclasse;


public abstract class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    
    //Pegar o Codigo
    public int getCodigo(){
        return codigo;
    }
    //Setando o código na classe
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    // Pegando a descrição do produto
    public String getDescricao(){
        return descricao;
    }
    //Setando a Descricao do produto
    public void setDescricao(){
        this.descricao=descricao;
    }
    // Pegando o preço do produto
    public double getPreco(){
        return preco;
    }
    //Setando o preço do produto
    public void setPreco(){
        this.preco=preco;
    }
    
    
    
    
    
    
    
    
    
}
