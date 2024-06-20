package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conversor;

public class Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o preço do dolar?");
		double valor = sc.nextDouble();

		System.out.println("Quantos dolares você quer comprar?");
		Conversor.quantidadeCompra = sc.nextDouble();

		double total = Conversor.valorFinal(valor);

		System.out.printf("valor a ser pago é : %.2f", total);

		sc.close();

	}

}
