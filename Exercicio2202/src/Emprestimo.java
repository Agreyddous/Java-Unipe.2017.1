/*
 * Questão 1 de Lista_Java_basico_fujioka_22_02_2017.docx
 * 
 * Allan Roque Barbosa da Silva - 1610013738
 * Fernando Velloso Borges de Mélo Gomes - 1610013276
 * 
 * CC P3 Noite
 * 
 */

public class Emprestimo {

	String nomeUsuario;
	int idade;
	float valorEmprestimo;
	float percentualJurosMes;
	int mesesParaPagar;
	
	public void imprimir(Emprestimo emprestimo){
		
		System.out.println("Nome: " + emprestimo.nomeUsuario);
		System.out.println("Idade: " + emprestimo.idade);
		System.out.println("Valor do emprestimo: " + emprestimo.valorEmprestimo);
		System.out.println("Percentual de juros por mês: " + emprestimo.percentualJurosMes);
		System.out.println("Quantidade de meses à pagar: " + emprestimo.mesesParaPagar);
		
	}
	
	public void calcularEmprestimo(Emprestimo emprestimo) {
		
		if( emprestimo.idade >= 18 && emprestimo.idade < 23){
			emprestimo.valorEmprestimo += (emprestimo.valorEmprestimo / emprestimo.mesesParaPagar) / emprestimo.percentualJurosMes; 
		}else if( emprestimo.idade >= 23 && emprestimo.idade <= 33){
			emprestimo.valorEmprestimo += (emprestimo.valorEmprestimo * 10) / 100;
		}
		
	}
	
}
