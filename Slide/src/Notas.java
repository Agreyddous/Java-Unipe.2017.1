import java.util.Scanner;

public class Notas
{
	public void Media()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		float primeiraNota = scanner.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		float segundaNota = scanner.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		float terceiraNota = scanner.nextFloat();
		
		float media = (primeiraNota + segundaNota + terceiraNota) / 3;
		
		if (media >= 7)
		{
			System.out.println("Passou");
		}
		
		else if (media < 7 && media >= 5)
		{
			System.out.println("Recuperacao");
		}
		
		else
		{
			System.out.println("Reprovado");
		}
		
		scanner.close();
	}
}
