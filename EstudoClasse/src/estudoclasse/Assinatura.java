package estudoclasse;

// a Classe Assinatura herda os atributos e métodos da classe produto criadas no mesmo pacotes

import java.time.LocalDate;
import java.time.Period;

public class Assinatura extends Produto {
    
    private LocalDate dataExpiracao;
    
    //Declarando métodos o tempo até a data de expiração do produto
    public Period calculaPeriodoAteExpiracao(){
        return Period.between(dataExpiracao, LocalDate.now());
    }
    //Função para obter a data da Expiração
    public LocalDate getDataExpiracao(){
        return dataExpiracao;
    }
    
    public void setDataExpiricao(LocalDate dataExpiracao){
        this.dataExpiracao=dataExpiracao;
    }
     public interface Expiravel{
         Period calculaPeriodoAteExpiracao();
     }
    
    
    
}
