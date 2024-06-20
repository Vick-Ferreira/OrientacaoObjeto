package entidade;

public class Produto {

	// ATRIBUTOS
	public String nome;
	public double preco;
	public int quantidade;

	// METODOS
	public double totalValor() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		// SOMAR QUANTIDADE
		// this = AUTOREFERENCIA DO OBJ (ACESSAR ATRIBUTO) apenas quando passa argunto
		this.quantidade += quantidade;// PEGAR O ATRIBUTO E SOMAR NELE O VALOR DO ARGUMENTO

	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() { // toString PERMITE IMPRESSAO DE UMA MANEIRA ESPECIFICA DOS ELEMENTOS
		// FORMATAÇÃO DA IMPRESSÃO
		return nome + ", $" + String.format("%.2f", preco) // FORMATAR NUMERO DE CA
				+ ", " + quantidade + " unidade, Total: $ " + String.format("%.2f", totalValor());

	}
}
