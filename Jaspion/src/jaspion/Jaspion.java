
package jaspion;


public class Jaspion {

   
    public static void main(String[] args) {
        long inicio=System.currentTimeMillis();
          //Tempo antes de Executar
          System.out.println("\nTempo Inicial de Execução"+inicio);
          funcao(1000);
          //Tempo depois de Executar
          
          long tempo_final=System.currentTimeMillis();
          System.out.println("\nTempo Depois de Executar"+tempo_final);
          System.out.println("\nTempo total de Execução"+(tempo_final-inicio));
          
          
          
        }
      public static void funcao(int contador){
          for(int i=0; i<contador;i++){
              System.out.println(i+"");
          }
      }  
    }
    

