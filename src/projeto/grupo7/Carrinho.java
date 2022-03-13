package projeto.grupo7;

public class Carrinho extends Inventario implements Mostravel {

	@Override
	// M�todo para mostrar o relat�rio do carrinho
	public void mostrar() {
		// Alface
		// ---------------
		// Alface
		/*
		 * Nome |Pre�o individual |% de doa��o |Qtd |Pre�o |Valor de doa��o
		 * 
		 * Alface(KG) |R$ 07,50 |2,5% |3 |R$ 22,50 |R$ 00,56 Tomate(KG) |R$ 10,00 |5% |5
		 * |R$ 50,00 |R$ 02,50
		 */
				
		// Mostra o cabe�alho do relat�rio
		System.out.print("\n" + Utilitario.padRightSpaces("C�digo", 8) + "|");
		System.out.print(Utilitario.padRightSpaces("Nome", 20) + "|");
		System.out.print(Utilitario.padRightSpaces("Qtd", 6) + "|");
		System.out.print(Utilitario.padRightSpaces("Pre�o", 16) + "|");
		System.out.print(Utilitario.padRightSpaces("% de doa��o", 16) + "|");
		System.out.println(Utilitario.padRightSpaces("Valor de doa��o", 16));
		System.out.println();
		
		// Para cada produto
		for (int i = 0; i < this.getQuantidadeElementos(); i++) {
			// Pega o c�digo e o produto
			int codigo = this.getCodigo(i);
			Produto produto = this.getProduto(codigo);
			
			// Calcula o pre�o e o valor de doa��o do produto
			float preco = produto.getPreco() * produto.getQuantidade();
			float valorDoacao = (produto.getPreco() * produto.getPorcentagemDoacao()) * produto.getQuantidade();
			
			// Mostra as propriedades do produto
			System.out.print(Utilitario.padRightSpaces("" + codigo, 8) + "|");
			System.out.print(Utilitario.padRightSpaces(produto.getNome(), 20) + "|");
			System.out.print(Utilitario.padRightSpaces("" + produto.getQuantidade(), 6) + "|");
			System.out.print(Utilitario.padRightSpaces(String.format("R$ %.2f", preco), 16) + "|");
			System.out.print(Utilitario.padRightSpaces(String.format("%.2f", produto.getPorcentagemDoacao() * 100) + "%", 16) + "|");
			System.out.println(Utilitario.padRightSpaces(String.format("R$ %.2f", valorDoacao), 16));
			
		}
	}

}
