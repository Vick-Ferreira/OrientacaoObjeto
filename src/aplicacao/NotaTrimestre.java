package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Alunos;

public class NotaTrimestre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Alunos alunos = new Alunos();
		alunos.nome = sc.next();
		alunos.n1 = sc.nextDouble();
		alunos.n2 = sc.nextDouble();
		alunos.n3 = sc.nextDouble();

		System.out.printf("Nota final = %.2f ", alunos.notaFinalTotal());

		alunos.notaFinalTotal();
		if (alunos.notaFinalTotal() < 60.00) {
			System.out.println("Reprovado");
			System.out.printf("Faltou %.2f pontos para passar", alunos.diferencaPontos());
		} else {
			System.out.println("Aprovado");
		}

		sc.close();
	}

}
