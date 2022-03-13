package projeto.grupo7;

public class Estoque extends Inventario implements Mostravel {
	@Override
	// M�todo para mostrar o relat�rio do estoque
	public void mostrar() {
		// Alface
		// ---------------
		// Alface
		/*
		 * C�digo |Nome |Pre�o |Qtd no estoque |% de doa��o
		 * 
		 * 0 |Tomate(KG) |R$ 10,00 |300 |5% 1 |Alface(KG) |R$ 07,50 |247 |2,5% 2
		 * |Feij�o(KG) |R$ 25,00 |300 |10%
		 */

		// Mostra o cabe�alho do relat�rio
		System.out.print("\n" + Utilitario.padRightSpaces("C�digo", 8) + "|");
		System.out.print(Utilitario.padRightSpaces("Nome", 16) + "|");
		System.out.print(Utilitario.padRightSpaces("Pre�o", 16) + "|");
		System.out.print(Utilitario.padRightSpaces("Qtd no estoque", 16) + "|");
		System.out.println(Utilitario.padRightSpaces("% de doa��o", 16));
		System.out.println();

		// Para cada produto
		for (int i = 0; i < this.getQuantidadeElementos(); i++) {
			// Pega o c�digo e o produto
			int codigo = this.getCodigo(i);
			Produto produto = this.getProduto(codigo);

			// Mostra as propriedades do produto
			System.out.print(Utilitario.padRightSpaces("" + codigo, 8) + "|");
			System.out.print(Utilitario.padRightSpaces(produto.getNome(), 16) + "|");
			System.out.print(Utilitario.padRightSpaces(String.format("R$ %.2f", produto.getPreco()), 16) + "|");
			System.out.print(Utilitario.padRightSpaces("" + produto.getQuantidade(), 16) + "|");
			System.out.println(
					Utilitario.padRightSpaces(String.format("%.2f", produto.getPorcentagemDoacao() * 100) + "%", 16));
		}
	}
}
