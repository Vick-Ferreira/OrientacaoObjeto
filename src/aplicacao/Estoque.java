package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// IMPORTAR CLASSE DO OBJETO ; OBJETO = PRODUTO, CRIA NOVA VARIAVEL E INICIA O
		// OBJ
		Produto produto = new Produto();

		System.out.println("Dados de produto");

		System.out.print("Name: ");
		// ACESSAR ATRIBUTO E DEFINIR O TIPO DA ENTRADA DE DADOS QUE ELE IRÁ RECEBER
		produto.nome = sc.nextLine();

		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();

		System.out.print("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println("Produto dados:" + produto);
		// RECUPERA O FORMATO QUE QUERO QUE ADD PARA IMPRESSAO NA FUNÇÃO ESPECIFICA
		// DENTRO DO OBJETO
		// QUANDO QUIZER QUE SEJA IMPRESSO DE UMA MANEIRA ESPECIFICA CHAMO MEU OBJETO E
		// RECUPERO COM O METODO TOsTRING LÁ PROGRAMADO

		System.out.print("Digit a quantidade de produtos que deseja adicionar ao estoque:");
		int quantidade = sc.nextInt(); // DADOS DE RECEBIMENTO DO USUARIO
		produto.addProduto(quantidade);// ADD OS MESMO E CHAMA A FUNÇÃO DE ADD OS DADOS RECEBIDOS AOS EXISTENTES

		System.out.println("Atualização de dados:" + produto);

		System.out.print("Digite a quantidade que  deseja remover do estoque:");
		quantidade = sc.nextInt(); // NÃO PRECISA DECLARA O TIPO DA VARIAVEL DE NOVO SE REUTILIZAR O NOME
		produto.removerProduto(quantidade);

		System.out.println("Atualização de dados:" + produto);

		sc.close();

	}

}
