package entidade;

//Subclasse
public class Retangulo {

	// atributos
	public double lado;
	public double altura;

	public double area() {
		// area = base * altura
		// this = AUTOREFERENCIA DO OBJ (ACESSAR ATRIBUTO)
		return lado * altura;
	}

	public double perimetro() {
		// 2 x (base + altura)
		return 2 * (lado + altura);
	}

	public double diagonal() {
		// d = rais quadrada de (base(ao quadrado) + altura (ao quadrado))
		return Math.sqrt(lado * lado + altura * altura);
	}

	public String toString() {
		// formatar para impressão

		return String.format("AREA = %.2f%n", area()) + // retornar resuldado da função area com duas casas decimais
				String.format("PERIMETRO = %.2f%n", perimetro()) + String.format("DIAGONAL = %.2f%n", diagonal());
	}
}
