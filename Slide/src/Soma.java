import java.util.Scanner;

public class Soma
{
	public void somarNumeros()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		float primeiroNumero = scanner.nextFloat();
		
		System.out.println("Digite outro numero:");
		float segundoNumero = scanner.nextFloat();
		
		System.out.println(primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero) );
		
		scanner.close();
	}
}
