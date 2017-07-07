/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JogoDaVelha {
private static int jog;
private static int [][] casa=new int[3][3];
private static int linha,coluna,win;
private static Scanner leitor=new Scanner(System.in);
public static void desenha(int x, int y) { 
	if (casa[x][y] == 1) { 
		// campo marcado pelo jogador 1 aparece com “X” 
		System.out.print("X"); 
	} else if (casa[x][y] == 2) { 
		// campo marcado pelo jogador 2 aparece com “O” 
		System.out.print("O"); 
	} else { 
		// campo não marcado aparece em branco (“ ”) 
		System.out.print(" "); 
	} 
}
public static void jogo() { 
	// aqui,são mostrados os números das colunas do tabuleiro 
	System.out.print("\n  1   2   3\n"); 
	// aqui é mostrado o número da primeira linha 
	System.out.print("1 "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 1
	desenha(0, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 2 
	desenha(0, 1); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 1 com a coluna 3 
	desenha(0, 2); 
	// desenha linha horizontal e mostra número da linha 2 
	System.out.print("\n -----------\n2 "); 
	// aqui é exibido o campo que cruza a linha 2 com a coluna 1 
	desenha(1, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 2 com a coluna 2 
	desenha(1, 1); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 2 com a coluna 3 
	desenha(1, 2); 
	// desenha linha horizontal e mostra número da linha 3 
	System.out.print("\n -----------\n3 "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 1 
	desenha(2, 0); 
	// caractere de divisão entre dois campos 
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 2 
	desenha(2, 1); 
	// caractere de divisão entre dois campos
	System.out.print("  | "); 
	// aqui é exibido o campo que cruza a linha 3 com a coluna 3 
	desenha(2, 2); 
}
public static void jogar(int jogador) { 
	// inicializando contador da estrutura while
	int i = 0; 
	// definindo o jogador da vez
	if (jogador == 1) { 
		jog = 1; 
	} else { 
		jog = 2; 
	} 
	System.out.println("\n\n Vez do Jogador " + jog); 
	while (i == 0) { 
		linha = 0; // inicializando valor da linha 
		coluna = 0; // inicializando valor da coluna 
		while (linha < 1 || linha > 3) { 
			System.out.print("Escolha a Linha (1,2,3):"); 
			// lendo a linha escolhida 
			linha = leitor.nextInt(); 
			// Aviso de linha inválida, caso o jogador tenha                                              
			// escolhido linha menor que 1 ou maior que 3 
			if (linha < 1 || linha > 3) { 
				System.out.println("Linha invalida! Escolha uma linha entre 1 e 3."); 
			} 
		} 
		while (coluna < 1 || coluna > 3) { 
			System.out.print("Escolha a Coluna (1,2,3):"); 
			// lendo a coluna escolhida 
			coluna = leitor.nextInt(); 
			if (coluna < 1 || coluna > 3) { 
				System.out.println("Coluna invalida! Escolha uma coluna entre 1 e 3."); 
			} 
		} 
		// Ajusta índices para começar do zero 
		linha = linha - 1; 
		coluna = coluna - 1; 
		if (casa[linha][coluna] == 0) { 
			// se não estiver marcado 
			// marcar com o símbolo do jogador da vez 
			casa[linha][coluna] = jog; 
			i = 1; 
		} else { // se o campo escolhido já estivar marcado 
			System.out.println("Posição ocupada!"); 
		} 
	} 
}
public static void check() { 
	int i = 0; 
	//verificando se houve vencedor na Horizontal:          
	for (i = 0; i < 3; i++) { 
		if (casa[i][0] == casa[i][1] && casa[i][0] == casa[i][2]) { 
			if (casa[i][0] == 1) win = 1; 
			if (casa[i][0] == 2) win = 2; 
		} 
	} 
	//verificando se houve vencedor na Vertical:
	for (i = 0; i < 3; i++) { 
		if (casa[0][i] == casa[1][i] && casa[0][i] == casa[2][i]) { 
			if (casa[0][i] == 1) win = 1; 
			if (casa[0][i] == 2) win = 2; 
		} 
	} 
	//verificando se houve vencedor na Diagonal de cima para baixo: 
	if (casa[0][0] == casa[1][1] && casa[0][0] == casa[2][2]) { 
		if (casa[0][0] == 1) win = 1; 
		if (casa[0][0] == 2) win = 2; 
	} 
	//verificando se houve vencedor na Diagonal de baixo para cima: 
	if (casa[0][2] == casa[1][1] && casa[0][2] == casa[2][0]) { 
		if (casa[0][2] == 1) win = 1; 
		if (casa[0][2] == 2) win = 2; 
	} 
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	int i = 0; 
	// percorre todo o tabuleiro, nas nove posições: 
	for (i = 0; i < 9; i++) { 
		jogo();// chama a rotina jogo(), que desenha o tabuleiro 
		if (i % 2 == 0) { 
			jogar(2); 
		} else { 
			jogar(1); 
		}
		// chama a rotina check (), para ver se alguém ganhou 
		check();
		if (win == 1 || win == 2) { 
			// sai do laço antes de completar o tabuleiro, 
			// se alguém tiver vencido 
			i = 10; 
		} 
	} 
	// chama a rotina jogo(), para desenhar novamente o tabuleiro 
	jogo(); 
	// verifica se houve vencedor 
	System.out.println(); 
	if (win == 1 || win == 2) { 
		// informa o vencedor 
		System.out.println("Jogador " + win + " é o ganhador!");
	} else { 
		// se não houve vencedor 
		System.out.println("Não houve vencedor! O jogo foi empate!!"); 
	} 
}
    }
    
}
