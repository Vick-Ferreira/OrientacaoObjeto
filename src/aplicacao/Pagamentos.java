package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionarios;

public class Pagamentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// IMPORTAR OBJETO
		Funcionarios funcionarios = new Funcionarios();

		System.out.print("Nome: ");
		funcionarios.nome = sc.next();
		System.out.print("Salário Bruto: ");
		funcionarios.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		funcionarios.imposto = sc.nextDouble();

		System.out.println("Funcionario: " + funcionarios);

		System.out.print("Qual a porcentagem do incremetno do sálario?");
		double porcentagem = sc.nextDouble(); // crio nova variavel com o nome do argumento da minha função na sub
												// classe para obter a %
		funcionarios.incrementoSalario(porcentagem);

		System.out.println("Atualização salarial:" + funcionarios);

		sc.close();

	}

}
