package aulacaleum;
import java.util.Arrays;
public class Vetor {
    // Declarando e Inicializando um array de Aluno com capacidade 100 e total de alunos.
private Aluno[] alunos = new Aluno[100];

private int totalDeAlunos=0;

//Liberar espaço no Array
private void garanteEspaco(){
    if(this.totalDeAlunos==this.alunos.length){
        Aluno[] novaArray=new Aluno[this.alunos.length*2];
        for(int i=0; i<this.alunos.length;i++){
            novaArray[i]=this.alunos[i];
            
        }
        this.alunos=novaArray;
    }
}

//Os dois métodos a seguir adicionam um aluno com ou sem uma posição.

public void adiciona(Aluno aluno) {
    this.garanteEspaco();
    this.alunos[this.totalDeAlunos]=aluno;
    
    this.totalDeAlunos++;
        }

    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();
if (!this.posicaoValida(posicao)) {
    
throw new IllegalArgumentException("Posição inválida");
}

for (int i = this.totalDeAlunos - 1; i >= posicao; i-=1) {
this.alunos[i + 1] = this.alunos[i];
}

this.alunos[posicao] = aluno;
this.totalDeAlunos++;
}
//Criando Função.
private boolean posicaoValida(int posicao) {
return posicao >= 0 && posicao <= this.totalDeAlunos;
}

public Aluno pega(int posicao) {
    //Verifica se tem alguma posição ocupada pelo novo dado.
    if(!this.posicaoOcupada(posicao)){
        throw new IllegalArgumentException("Posição Inválida");
 
    }
    //Retorna a posição do Aluno setado
    return this.alunos[posicao];    
    }

private boolean posicaoOcupada(int posicao){
    // Retorna a posição ocupada maior ou igual a zero e menor do que o valor do total
        return posicao>=0 && posicao<this.totalDeAlunos;
}

public void remove(int posicao){
    if (!this.posicaoOcupada(posicao)) {
throw new IllegalArgumentException("Posição inválida");
}
for (int i = posicao; i < this.totalDeAlunos - 1; i++) {
this.alunos[i] = this.alunos[i + 1];
}
this.totalDeAlunos--;
}


public boolean contem(Aluno aluno) {
    //O laço percorre o total de alunos e retorna verdadeiro se tiver alguém
    for(int i=0; i<this.totalDeAlunos;i++){
        if(aluno.equals(this.alunos[i])){
            return true;
        }
    }
    return false;
}

public int tamanho() {
    //Retorna total de Alunos.
    
   return this.totalDeAlunos;
}

public String toString() {
    if(this.totalDeAlunos==0){
        return "[]";
    }
    
    StringBuilder builder=new StringBuilder();
    builder.append("[");
    for(int i=0; i<this.totalDeAlunos-1;i++){
        builder.append(this.alunos[i]);
        builder.append(",");
        builder.append(this.alunos[this.totalDeAlunos-1]);
        builder.append("]");
        
    }
    
return Arrays.toString(alunos);
}
}


