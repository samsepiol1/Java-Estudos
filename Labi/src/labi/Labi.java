/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labi;

/**
 *
 * @author Deus
 */
public class Labi {

    
	private static final char PAREDE_VERTICAL = '|'; 
	private static final char PAREDE_HORIZONTAL = '-'; 
	private static final char VAZIO = ' '; 
	private static final char TAMANHO = 10;
        private static final char INICIO='I';
        private static final char DESTINO='D';
        private static final char CAMINHO='.';
        private static final char SEM_SAIDA='X';
        
        private static int linhainicio;
        private static int colunainicio;
	private static char[][] tabuleiro;

    

public static boolean procurarCaminho(int linhaAtual, int colunaAtual) { 
	int proxLinha; 
	int proxColuna; 
	boolean achou = false; 
	// tenta subir 
	proxLinha = linhaAtual - 1; 
	proxColuna = colunaAtual; 
	achou = tentarCaminho(proxLinha, proxColuna); 
	// tenta descer 
	if (!achou) { 
		proxLinha = linhaAtual + 1; 
		proxColuna = colunaAtual; 
		achou = tentarCaminho(proxLinha, proxColuna); 
	} 
	// tenta à esquerda 
	if (!achou) { 
		proxLinha = linhaAtual; 
		proxColuna = colunaAtual - 1; 
		achou = tentarCaminho(proxLinha, proxColuna); 
	} 
	// tenta à direita 
	if (!achou) { 
		proxLinha = linhaAtual; 
		proxColuna = colunaAtual + 1; 
		achou = tentarCaminho(proxLinha, proxColuna); 
	} 
	return achou; 
}
private static boolean tentarCaminho(int proxLinha, int proxColuna) { 
	boolean achou = false; 
	if (tabuleiro[proxLinha][proxColuna] == DESTINO) { 
		achou = true; 
	} else if (posicaoVazia(proxLinha, proxColuna)) { 
		// marcar 
		tabuleiro[proxLinha][proxColuna] = CAMINHO; 
		imprimir(); 
		achou = procurarCaminho(proxLinha, proxColuna); 
		if (!achou) { 
			tabuleiro[proxLinha][proxColuna] = SEM_SAIDA; 
			imprimir(); 
		} 
	} 
	return achou; 
}
public static boolean posicaoVazia(int linha, int coluna) { 
	boolean vazio = false; 
	if (linha >= 0 && coluna >= 0 && linha < TAMANHO && coluna < TAMANHO) { 
		vazio = (tabuleiro[linha][coluna] == VAZIO); 
	} 
	return vazio; 
}





	public static void inicializarMatriz() { 
            linhainicio=gerarNumero(1,TAMANHO/2-1);
            colunainicio=gerarNumero(1,TAMANHO/2-1);
            tabuleiro[linhainicio][colunainicio]=INICIO;
            int linhaDestino=gerarNumero(TAMANHO/2,TAMANHO-2);
            int colunaDestino=gerarNumero(TAMANHO/2,TAMANHO-2);
            tabuleiro[linhaDestino][linhaDestino]=DESTINO;
            
		int i, j; 
		for (i = 0; i < TAMANHO; i++) { 
			tabuleiro[i][0] = PAREDE_VERTICAL; 
			tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL; 
			tabuleiro[0][i] = PAREDE_HORIZONTAL; 
			tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL; 
		} 
		for (i = 1; i < TAMANHO - 1; i++) { 
			for (j = 1; j < TAMANHO - 1; j++) { 
				tabuleiro[i][j] = VAZIO; 
			} 
		} 
	}
        
        public static int gerarNumero(int minimo, int maximo) {
	int valor = (int) Math.round(Math.random()  * (maximo - minimo));
	return minimo + valor;
}
            
            
            
        

	public static void imprimir() { 
		for (int i = 0; i < TAMANHO; i++) { 
			for (int j = 0; j < TAMANHO; j++) { 
				System.out.print(tabuleiro[i][j]); 
			} 
			System.out.println(); 
                          try {
	Thread.sleep(300);
} catch (InterruptedException e) {
	e.printStackTrace();
}
                }
        }
      
  

	public static void main(String Arg[]) { 
		tabuleiro = new char[TAMANHO][TAMANHO]; 
                 System.out.println("procurando solução para o labirinto");
                        boolean achou=procurarCaminho(linhainicio,colunainicio);
                        if(achou){
                            System.out.println("ACHOU O CAMINHO");
                        }else{
                            System.out.println("tente novamente e procure outro caminho seu burro");
                            inicializarMatriz(); 
		imprimir(); 
                        }
		} 
	}
		
                      

	


  
