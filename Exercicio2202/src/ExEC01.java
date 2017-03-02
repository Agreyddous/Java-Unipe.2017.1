/*
 * Questão 1 de LIsta_Java_Estrutura_controle_fujioka_22_02_2017.doc
 * 
 * Allan Roque Barbosa da Silva - 1610013738
 * Fernando Velloso Borges de Mélo Gomes - 1610013276
 * 
 * CC P3 Noite
 * 
 */

import java.util.Scanner;

public class ExEC01 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o valor do seu salario: ");
		float salario = leitor.nextFloat();
		
		System.out.print("Digite o percentual de aumento (%): ");
		float percent = leitor.nextFloat();
		
		float aumento = calcularAumento(salario, percent);
		
		System.out.println("\nVocê recebeu um aumento de " + aumento + " Reais!");
		System.out.println("Seu novo salário é de " + (salario + aumento) + " Reais");
		
	}

	private static float calcularAumento(float salario, float percent) {
		
		float valor = percent * salario / 100 ;
		
		return valor;
	}
	
}
