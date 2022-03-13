package projeto.grupo7;

import java.util.Scanner;

public class Mercado {
	// Vari�veis do estoque e do carrinho
	private static Estoque estoque;
	private static Carrinho carrinho;

	// M�todo para mostrar e pegar a op��o do menu
	public static int menu(Scanner leia) {
		// Mostra o menu
		System.out.println("\nInsira uma op��o:");

		System.out.println("\n1 - Adicionar um produto ao carrinho.");
		System.out.println("2 - Checar o carrinho.");
		System.out.println("3 - Sair do programa.");

		// Ler a op��o
		int op = leia.nextInt();

		// Continua lendo a op��o caso for inv�lida
		while (op < 1 || op > 3) {
			System.out.println("\nOp��o inv�lida! Tenta de novo:");
			op = leia.nextInt();
		}

		// Retorna a op��o
		return op;
	}
	
	// M�todo para adicionar um produto ao carrinho
	public static void adicionarAoCarrinho() {
		
	}

	public static void main(String[] args) {
		// Cria��o do estoque e do carrinho
		estoque = new Estoque();
		carrinho = new Carrinho();
		
		// Cria��o de um objeto scanner para ler a entrada do usu�rio
		Scanner leia = new Scanner(System.in);

		System.out.println("\nSeja bem vindo ao mercado!");

		int op;

		do {
			// Mostrar o menu e pegar a op��o
			op = menu(leia);

			switch (op) {
				case 1: { // Adicionar um produto ao carrinho
					break;
				}
			}

		} while (op != 3);

		System.out.println("\nAt� mais!");
	}

}
