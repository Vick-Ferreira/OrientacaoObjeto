package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Retangulo;

public class LadosRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Exercicio1

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Importar objeto
		Retangulo retangulo = new Retangulo();

		System.out.println("Crie um retangulo colocando uma largura e  altura:");
		retangulo.lado = sc.nextDouble();
		retangulo.altura = sc.nextDouble();// atributo recebendo tipo de entrada de dados
		retangulo.area();// com os valores que entraram fazer a operação

		System.out.println(retangulo);

		sc.close();

	}

}
