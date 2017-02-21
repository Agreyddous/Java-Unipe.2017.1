import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoDao
{
	static Scanner scanner;
	
	public static void main(String[] args)
	{
		scanner = new Scanner(System.in);
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		String continuar = "S";
		
		while(continuar.contains("S"))
		{
			Produto produto = new Produto();
			produto = cadastrar();
			produtos.add(produto);
			
			System.out.println("Continuar? (S/N)");
			continuar = scanner.nextLine();
		}
		
		System.out.println("Deseja atualizar algum produto?");
		continuar = scanner.nextLine();
		
		while (continuar.contains("S"))
		{
			atualizar(produtos);
			
			System.out.println("Deseja atualizar outro produto?");
			continuar = scanner.nextLine();
		}
		
		System.out.println("Deseja excluir algum produto?");
		continuar = scanner.nextLine();
		
		while (continuar.contains("S"))
		{
			excluir(produtos);
			
			System.out.println("Deseja excluir outro produto?");
			continuar = scanner.nextLine();
		}
		
		listar(produtos);
		
		scanner.close();
	}
	
	public static Produto cadastrar()
	{
		scanner = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Digite o nome do produto:");
		produto.nome = scanner.nextLine();
		
		System.out.println("Digite a marca do produto:");
		produto.marca = scanner.nextLine();
		
		System.out.println("Digite a descricao do produto:");
		produto.descricao = scanner.nextLine();
		
		System.out.println("Digite o tipo do produto:");
		produto.tipo = scanner.nextLine();
		
		System.out.println("Digite o ID do produto:");
		produto.id = scanner.nextLine();
		
		return produto;
	}
	
	public static void atualizar(ArrayList<Produto> produtos)
	{
		scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome ou ID do produto:");
		String busca = scanner.nextLine();
		
		boolean produtoAtualizado = false;
		
		for (Produto produto : produtos)
		{
			if((produto.nome.contains(busca)) || (produto.id.contains(busca)))
			{
				System.out.println("Digite o nome do produto:");
				produto.nome = scanner.nextLine();
				
				System.out.println("Digite a marca do produto:");
				produto.marca = scanner.nextLine();
				
				System.out.println("Digite a descricao do produto:");
				produto.descricao = scanner.nextLine();
				
				System.out.println("Digite o tipo do produto:");
				produto.tipo = scanner.nextLine();
				
				System.out.println("Digite o ID do produto:");
				produto.id = scanner.nextLine();
				
				produtoAtualizado = true;
				
				break;
			}
		}
		
		if(!produtoAtualizado) System.out.println("Produto nao encontrado");
	}
	
	public static void excluir(ArrayList<Produto> produtos)
	{
		scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome ou ID do produto:");
		String busca = scanner.nextLine();
		
		boolean produtoRemovido = false;
		
		for (Produto produto : produtos)
		{
			if((produto.nome.contains(busca)) || (produto.id.contains(busca)))
			{				
				produtos.remove(produto);
				produtoRemovido = true;
				
				break;
			}
		}
		
		if(!produtoRemovido) System.out.println("Produto nao encontrado");
	}
	
	public static void listar(ArrayList<Produto> produtos)
	{
		for (Produto produto : produtos)
		{
			System.out.println("\n" + "Nome: " + produto.nome);
			System.out.println("Marca: " + produto.marca);
			System.out.println("Tipo: " + produto.tipo);
			System.out.println("Descricao: " + produto.descricao);
			System.out.println("ID: " + produto.id);
		}
	}

}
