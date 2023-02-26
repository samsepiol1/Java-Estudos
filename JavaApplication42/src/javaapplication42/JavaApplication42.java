/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author Deus
 */

import java.util.Scanner;
public class JavaApplication42 {
public enum EnumDiaSemana { 
	DOMINGO, SEGUNDA_FEIRA, TERCA_FEIRA, 
	QUARTA_FEIRA, QUINTA_FEIRA, SEXTA_FEIRA, SABADO 
}
    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) { 
		Scanner leitor = new Scanner(System.in); 
		System.out.println("Digite o dia da semana (1 a 7, onde 1 representa o domingo):"); 
		EnumDiaSemana diaSemana = pegarDiaSemana(leitor.nextInt()); 
		// aqui o programa faz o que ele precisa fazer 
		// ... 
		System.out.println("Você selecionou o dia da semana de "+ nomeDiaSemana(diaSemana)); 
	}
	
	public static EnumDiaSemana pegarDiaSemana(int diaSemanaInt) { 
		EnumDiaSemana diaSemana = EnumDiaSemana.SABADO; 
		switch (diaSemanaInt) { 
			case 1: 
				diaSemana = EnumDiaSemana.DOMINGO; 
				break; 
			case 2: 
				diaSemana = EnumDiaSemana.SEGUNDA_FEIRA; 
				break; 
			case 3: 
				diaSemana = EnumDiaSemana.TERCA_FEIRA; 
				break; 
			case 4: 
				diaSemana = EnumDiaSemana.QUARTA_FEIRA; 
				break; 
			case 5: 
				diaSemana = EnumDiaSemana.QUINTA_FEIRA; 
				break; 
			case 6: 
				diaSemana = EnumDiaSemana.SEXTA_FEIRA; 
		} 
		return diaSemana; 
	}
	
	public static String nomeDiaSemana(EnumDiaSemana diaSemana) { 
		String nome = "Sábado"; 
		switch (diaSemana) { 
			case DOMINGO: 
				nome = "Domingo"; 
				break; 
			case SEGUNDA_FEIRA: 
				nome = "Segunda-feira"; 
				break; 
			case TERCA_FEIRA: 
				nome = "Terça-feira"; 
				break; 
			case QUARTA_FEIRA: 
				nome = "Quarta-feira"; 
				break; 
			case QUINTA_FEIRA: 
				nome = "Quinta-feira"; 
				break; 
			case SEXTA_FEIRA: 
				nome = "Sexta-feira"; 
		} 
		return nome; 
	} 
}