
package cpf_gerador_maluco;
import java.util.Scanner;
public class Cpf_gerador_maluco {

    public static void main(String[] args) {
        String cpf_seis_digitos;
        String nome_alvo;
        int variavel_de_controle_loop;
        String juntar_cpf;
        Scanner leitor=new Scanner(System.in);
        System.out.println("Insira os caracteres anteriores do CPF:");
        cpf_seis_digitos=leitor.nextLine();
        System.out.println("Insira aqui o nome do alvo:");
        nome_alvo=leitor.nextLine();
        for(int i=0; i<999; i++){
            if(i<=99){
                System.out.println("Combinação Inválida");
            }else{
               variavel_de_controle_loop=i+1;
               juntar_cpf=variavel_de_controle_loop+cpf_seis_digitos;
               System.out.println(variavel_de_controle_loop);
               System.out.println("Probalidades de CPF:"+juntar_cpf);
                
            }
        }
        
        
    }
    
}
