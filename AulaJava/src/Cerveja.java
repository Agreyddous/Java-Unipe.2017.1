import java.util.Scanner;

public class Cerveja
{
	public static void main(String[] args)
	{
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantas cervejas tem no freezer?");
		
		int cervejas = leitor.nextInt();
		
		while (cervejas > 0)
		{
			System.out.println(cervejas + " cervejas na freezer.");
			
			cervejas--;
			
			System.out.println("Pego uma garrafa, passo para frente.");
			System.out.println("Agora são " + cervejas + " cervejas na freezer.\n");
		}
		
		leitor.close();
	}
}