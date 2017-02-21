import java.util.Scanner;

public class NomeEIdade
{
	public void perguntarNomeEIdade()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = scanner.next();
		System.out.println("Digite sua idade:");
		int idade = scanner.nextInt();
		
		System.out.println(nome + " , " + idade);
		
		scanner.close();
	}
}
