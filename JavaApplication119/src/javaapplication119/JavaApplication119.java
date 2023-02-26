package javaapplication119;
import java.util.Scanner;
public class JavaApplication119 {
    public static void main(String[] args) {
        String nomes[];
        nomes=new String[5];
        double[] notas=new double[5];
        double soma=0, media;
        
        Scanner leitor=new Scanner(System.in);
        for(int i=0; i<=4; i++){
            System.out.println("Entre com o nome do Aluno:"+(i+1));
            nomes[i]=new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do Aluno:");
            notas[i]=new Scanner(System.in).nextDouble();
            soma=soma+notas[i];
            
            
        }
        media=soma/5;
        System.out.println("A média dos Alunos é"+media);
        System.out.println();
        System.out.println("Lista dos alunos cuja note é superior a média da turma");
        for(int i=0; i<=4;i++){
            if(notas[i]>media){
                System.out.println(nomes[i]);
            }
        }
       
    }
    
}
