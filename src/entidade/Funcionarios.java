package entidade;

public class Funcionarios {// sub class

	// atributos
	public String nome;
	public double salarioBruto;
	public double imposto;

	// metodos
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}

	public void incrementoSalario(double porcentagem) {
		// salarioBase + (salarioBase * porcentagem / 100.00)
		salarioBruto += (salarioBruto * porcentagem / 100.00);

	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
		// vai mostrar nome e salário liquido.
	}

}
