package projeto.grupo7;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Scanner;

public class Mercado {

	public static void main(String[] args) {
		// Criando array list do estoque do mercado
		ArrayList<Produto> estoque  = new ArrayList<Produto>();
		
		// Criando array list do carrinho de compras
		ArrayList<Produto> carrinho = new ArrayList<Produto>();
		
		// Cria��o de um objeto scanner para ler a entrada do usu�rio
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nSeja bem vindo ao mercado!");
		
		Inventario inv = new Estoque();
		
		inv.adicionarProduto(32, new ProdutoPerecivel());
		inv.adicionarProduto(16, new ProdutoPerecivel());
		inv.adicionarProduto(47, new ProdutoPerecivel());
		
		for (int i = 0; i < inv.getQuantidadeElementos(); i++) {
			int cod = inv.getCodigo(i);
			System.out.println(cod);
			System.out.println(inv.getProduto(cod).getNome());
		}
		
		/*// Op��o do menu
		int op;
		
		for (Entry<Integer, Produto> chaveValor : estoque.getEntries()) {
			
		}
		
		do {
			System.out.println("\n");
			
			if (estoque.tentarSubtrairQuantidade(3, 5)) {
				carrinho.adicionarProduto(estoque.getProduto(3), 5);
			} else {
				System.out.println("\nEstoque n�o tem quantidade suficiente desse produto.");
			}
		} while (op != 3);
		
		System.out.println("\nAt� mais!");*/
	}

}







