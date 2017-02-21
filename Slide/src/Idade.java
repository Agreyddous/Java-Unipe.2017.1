import java.util.Scanner;

public class Idade
{
	public void Idade()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu ano de nascimento:");
		int anoNascimento = scanner.nextInt();
		
		System.out.println("Digite o ano atual:");
		int anoAtual = scanner.nextInt();
		
		System.out.println("Sua idade e: " + (anoNascimento + anoAtual));
		
		scanner.close();
	}
}
