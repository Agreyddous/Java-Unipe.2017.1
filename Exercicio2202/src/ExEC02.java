/*
 * Questão 2 de LIsta_Java_Estrutura_controle_fujioka_22_02_2017.doc
 * 
 * Allan Roque Barbosa da Silva - 1610013738
 * Fernando Velloso Borges de Mélo Gomes - 1610013276
 * 
 * CC P3 Noite
 * 
 */

import java.util.Scanner;

public class ExEC02 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("=--= BEM VINDO AO PARIMPADOR =--=\n");
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Digite o " + (i+1) + "º numero: ");
			int valor = leitor.nextInt();
			
			System.out.print("Ele é ");
			parOuImpar(valor);
			
		}
		
	}

	private static void parOuImpar(int valor) {
		
		valor %= 2;
		
		if (valor == 0) {
			System.out.println("PAR !\n");
		}else{
			System.out.println("IMPAR !\n");
		}
		
	}
	
}
