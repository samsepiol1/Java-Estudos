/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registros_enum;

/**
 *
 * @author Deus
 */
import java.util.Scanner;
public class endereco {
    public String rua;
    public int numero;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;


    


    /**
     * @param args the command line arguments
     */
   public class ProgramaLeitorEndereco { 
	public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("-- Digite seu primeiro endereço --"); 
		Endereco end1 = lerEndereco(leitor); 
		System.out.println("-- Digite seu segundo endereço --"); 
		Endereco end2 = lerEndereco(leitor); 
		System.out.println("------ Seu primeiro endereço é -----"); 
		imprimirEndereco(end1); 
		System.out.println("------ Seu segundo endereço é -----");
		imprimirEndereco(end2); 
	}

	public static Endereco lerEndereco(Scanner leitor) { 
		Endereco end = new Endereco(); 
		System.out.println("Digite a rua onde você mora:"); 
		end.rua = leitor.nextLine(); 
		System.out.println("Digite o número da residência:"); 
		end.numero = leitor.nextInt(); 
		leitor.nextLine(); 
		System.out.println("Digite o bairro:"); 
		end.bairro = leitor.nextLine(); 
		System.out.println("Digite a cidade:"); 
		end.cidade = leitor.nextLine(); 
		System.out.println("Digite o estado:"); 
		end.estado = leitor.nextLine(); 
		System.out.println("Digite o CEP:"); 
		end.cep = leitor.nextLine(); 
		return end; 
	}
	public static void imprimirEndereco(Endereco end) { 
		System.out.println(end.rua + ", " + end.numero); 
		System.out.println(end.bairro + ", " + end.cidade); 
		System.out.println("CEP " + end.cep + ", " + end.estado); 
	} 
}
        
        
    
    

