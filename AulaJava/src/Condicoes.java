import java.util.Scanner;

public class Condicoes
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um numero");
		
		int z = leitor.nextInt();
		
		if (z == 10) System.out.println("Z == 10");
		
		else System.out.println("Z != 10");
		
		System.out.println("Isso e uma enrolacao");
		
		leitor.close();
	}
}
