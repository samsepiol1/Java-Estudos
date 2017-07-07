private static final char PAREDE_VERTICAL = '|';

    private static final char PAREDE_HORIZONTAL = '-';

    private static final char VAZIO = ' ';

    private static final char TAMANHO = 10;

    private static final char PAREDE_INTERNA = '@';

    private static final double PROBABILIDADE = 0.5;

    private static char[][] tabuleiro;

    private static final char INICIO='I';

    private static final char DESTINO='D';

    private static int linhaInicio;

    private static int colunaInicio;

    private static int linhaDestino;

    private static int colunaDestino;

    private static final char CAMINHO = '.';

    private static final char SEM_SAIDA='x';

    private static int p=0;

    private static int c=0;

   

    public static int gerarNumero(int minimo, int maximo){

        int valor = (int) Math.round(Math.random()*(maximo-minimo));

        return minimo+valor;

    }

   

    public static void inicializarMatriz() {

        int i, j;

        for (i = 0; i < TAMANHO; i++) {

            tabuleiro[i][0] = PAREDE_VERTICAL;

            tabuleiro[i][TAMANHO - 1] = PAREDE_VERTICAL;

            tabuleiro[0][i] = PAREDE_HORIZONTAL;

            tabuleiro[TAMANHO - 1][i] = PAREDE_HORIZONTAL;

        }

       

        for (i = 1; i < TAMANHO - 1; i++) {

            for (j = 1; j < TAMANHO - 1; j++) {

                if(Math.random()>PROBABILIDADE){

                        tabuleiro[i][j] = PAREDE_INTERNA;

                }else

                tabuleiro[i][j] = VAZIO;

            }

        }

        linhaInicio = gerarNumero(1, TAMANHO/2 -1);

        colunaInicio = gerarNumero(1, TAMANHO/2 -1);

        tabuleiro[linhaInicio][colunaInicio]=INICIO;

       

        linhaDestino = gerarNumero(TAMANHO/2, TAMANHO-2);

        colunaDestino = gerarNumero(TAMANHO/2, TAMANHO-2);

        tabuleiro[linhaDestino][colunaDestino]=DESTINO;

                

    }

   

    public static boolean procurarCaminho(int linhaAtual, int colunaAtual){

        int proxLinha;

        int proxColuna;

        boolean achou=false;

        //tenta subir

        proxLinha=linhaAtual-1;

        proxColuna=colunaAtual;

        achou=tentarCaminho(proxLinha, proxColuna);

        //tenta descer

        if(!achou){

            proxLinha=linhaAtual+1;

            proxColuna=colunaAtual;

            achou=tentarCaminho(proxLinha, proxColuna);

        }

        //tenta à esquerda

        if(!achou){

            proxLinha=linhaAtual;

            proxColuna=colunaAtual-1;

            achou=tentarCaminho(proxLinha, proxColuna);

        }

        //tentar à direita

        if(!achou){

            proxLinha=linhaAtual;

            proxColuna=colunaAtual+1;

            achou=tentarCaminho(proxLinha, proxColuna);

        }

        return achou;

    }

 

    private static boolean tentarCaminho(int proxLinha, int proxColuna){

        boolean achou=false;

        if(tabuleiro[proxLinha][proxColuna] == DESTINO){

            achou=true;

        }else if(posicaoVazia(proxLinha, proxColuna)){

            //marcar

            tabuleiro[proxLinha][proxColuna]=CAMINHO;

            achou=procurarCaminho(proxLinha, proxColuna);

            p++;

            if(!achou){

                tabuleiro[proxLinha][proxColuna]=SEM_SAIDA;

                c++;

            }

        }

        return achou;

    }

   

    public static boolean posicaoVazia(int linha, int coluna){

        boolean vazio = false;

        if(linha>=0 && coluna >= 0 && linha < TAMANHO && coluna < TAMANHO){

            vazio = (tabuleiro[linha][coluna]==VAZIO);

        }

        return vazio;

    }

   

 

public static void main(String args[]) {

    tabuleiro = new char[10][10];

    inicializarMatriz();

    System.out.println("\n Procurando solução... \n");

    boolean achou = procurarCaminho(linhaInicio, colunaInicio);

    if(achou){

        System.out.println("Achou o caminho!");

       

    }else{

        System.out.println("Não achou o caminho!");

    }

    System.out.println(p-c);

    }

}