package entidade;

public class Alunos {
	public String nome;
	public double n1;
	public double n2;
	public double n3;

	public double notaFinalTotal() {
		return n1 + n2 + n3;
	}

	public double diferencaPontos() {
		if (notaFinalTotal() < 60.0) {
			return 60.00 - notaFinalTotal();
		} else {
			return 0.0;
		}

	}

}