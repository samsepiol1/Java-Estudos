/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication47;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class JavaApplication47 {
    public static final String APROVADO="aprovado";
    public static final String REPROVADO="reprovado";
    public static final String RECUPERACAO="Em recuperação";
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor=new Scanner(System.in);
        pegarNotas(leitor); 
        System.out.println("digite aqui a primeira nota");
        double nota1=leitor.nextDouble();
        System.out.println("digite aqui a segunda nota");
        double nota2=leitor.nextDouble();
        System.out.println("digite aqui a terceira nota");
        double nota3=leitor.nextDouble();
        System.out.println("digite aqui a quarta nota");
        double nota4=leitor.nextDouble();
        double media=calcularMedia(nota1,nota2,nota3,nota4);
        System.out.println("sua nota foi"+media);
        System.out.println("Resultado, você está " + verificarSituacaoAluno(media)); 
        
        
        
    }
    public static String verificarSituacaoAluno(double media){
        if(media>=7){
            return APROVADO;
        }else if (media<3){
            return REPROVADO;
        }else{
            return RECUPERACAO;
        }
    }
    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4){
        return(nota1+nota2+nota3+nota4)/4;
        
    }

    private static void pegarNotas(Scanner leitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
