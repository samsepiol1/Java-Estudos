//Nome do pacote
package javaapplication110;
//Classes Criadas
import java.util.Scanner;
public class JavaApplication110 {

 
    public static void main(String[] args) {
        
        
       //Declaração da variável
       int ano;
        // Declaração do Array com os dias
        int [] dias={30,28,31,30,31,30,31,31,30,31,30,31};
       
        
        //Declaração dos Arrays com meses
       String [] mes={"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        
        //Inicialização da Classe Scanner
        Scanner leitor=new Scanner(System.in);
        
        // Pergunta ao Usuário
        System.out.println("Digite aqui o ano:");
        ano=leitor.nextInt();
        //Laço if-else para verificar se é bissexto
        if(ano%400==0){
            System.out.println(ano+ "O ano digitado é bissexto");
             dias[1]=29;
             for(int i=0; i<dias.length;i++){
                 System.out.println("O Mes"+ " " +mes[i]+ " "+ "Tem"+" " +dias[i] +" "+"Dias");
             }
             
        
    }else if((ano%4==0) && (ano%100!=0)){
        System.out.println(ano+ "É bissexto");
         dias[1]=29;
         for(int i=0; i<dias.length;i++){
                 System.out.println("O Mes"+ " " +mes[i]+ " "+ "Tem"+" " +dias[i] +" "+"Dias");
             }
        
        
    }else{
        for(int i=0; i<dias.length;i++){
            System.out.println("O Mes"+ " " +mes[i]+ " "+ "Tem"+" " +dias[i] +" "+"Dias");
        }
         System.out.println(ano + " não é bissexto");
    }
    
        
       
           
            }
            
        }
        
    
    

