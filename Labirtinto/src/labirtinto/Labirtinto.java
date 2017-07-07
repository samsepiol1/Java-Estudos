/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirtinto;

/**
 *
 * @author Deus
 */
public class Labirtinto {
    private static final char PAREDE_VERTICAL='|';
    private static final char PAREDE_HORIZONTAL='-';
    private static final char VAZIO=' ';
    private static final char TAMANHO = 10;
    private static final char PAREDE_INTERNA='@';
    private static final double PROBABILIDADE=0.7;
    private static char [][]tabuleiro;
    
    
    public static void inicializarMatriz(){
        int i, j; 
		for (i = 0; i < TAMANHO; i++) { 
        
            tabuleiro[i][0]=PAREDE_VERTICAL;
            tabuleiro[i][TAMANHO-1]=PAREDE_VERTICAL;
            tabuleiro[0][i]=PAREDE_HORIZONTAL;
            tabuleiro[TAMANHO-1][i]=PAREDE_VERTICAL;
           for (i = 1; i < TAMANHO - 1; i++) {
	for (j = 1; j < TAMANHO - 1; j++) {
		if (Math.random() > PROBABILIDADE) {
			tabuleiro[i][j] = PAREDE_INTERNA;
		} else {
			tabuleiro[i][j] = VAZIO;
		}
                	
                
                        
                     
			public static void Main(){
		for (int i = 0; i < TAMANHO; i++) { 
			for (int j = 0; j < TAMANHO; j++) { 
				System.out.print(tabuleiro[i][j]); 
			} 
			System.out.println(); 
		} 
	}
                
	
	
        

        
    
   	

        
    
   	

        
    
   	

        
    
   
  


	
             
                        
            
        
       
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tabuleiro=new char[TAMANHO][TAMANHO];
        inicializarMatriz();
        imprimir();
        
    }
    
}
