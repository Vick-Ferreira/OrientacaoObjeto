package entidade;

public class Conversor {

	// declara~]ao de atributos e métodos com STATIC na subclasse permite , utilizar
	// sem importar a classe na principal
	public static final double IMPOSTO = 0.06;
	public static double quantidadeCompra;

	public static double valorFinal(double valor) {// ARGUMENTO PASSADA PELA NOVA VARIAVEL QUE FOI CRIADA NA CLASSE
													// PRINCIPAL
		return valor * quantidadeCompra * (1 + IMPOSTO);
	}

}
