package projeto.grupo7;

import java.util.HashMap;
import java.util.Map;

public abstract class Inventario {
	// Array list de produtos do invent�rio
	private Map<Integer, Produto> produtos;

	// Construtor do invent�rio
	public Inventario() {		
		// Cria uma inst�ncia de map de produtos, mapeado pelo c�digo int
		produtos = new HashMap<Integer, Produto>();
	}

	// M�todo para pegar a quantidade de elementos de produtos
	// no map
	public int getQuantidadeElementos() {
		return produtos.size();
	}
	
	// M�todo para pegar o c�digo de um produto, a partir da posi��o
	// no Map
	public int getCodigo(int idx) {
		return (int)produtos.keySet().toArray()[idx];
	}

	// M�todo para pegar um produto individual pelo c�digo
	public Produto getProduto(int cod) {
		return produtos.get(cod);
	}
	
	// M�todo para adicionar um produto, de determinado c�digo
	public void adicionarProduto(int cod, Produto prod) {
		produtos.put(cod, prod);
	}
	
	// M�todo que tenta reduzir a quantidade de um produto,
	// caso conseguir reduzir, return true
	public boolean tentarSubtrairQuantidade(int cod, int qtd) {
		// Pega o produto usando o m�todo da classe Inventario
		Produto produto = getProduto(cod);
		
		// Checa se a quantidade no invent�rio � maior ou igual
		// � quantidade passada no m�todo
		if (produto.getQuantidade() >= qtd) {
			// Reduz a quantidade do produto
			produto.adicionarQuantidade(-qtd);
			return true;
		} else {
			return false;
		}
	}
}
