package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entidade.DadosFuncionarios;

public class Empresa {

	//metodo
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("Quantos funcionarios quer registrar?");
		int n = sc.nextInt();
		
		
		List <DadosFuncionarios> list = new ArrayList<>(); //criando lisrta que vai receber dados de numeros inteiros 
		
		for(int i=0; i<n; i++) {
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			
			sc.nextLine();// quebra linha
			
			String nome = sc.next();
			System.out.println("Salário: ");
			Double salario = sc.nextDouble();
			
			//instânciando meu objeto, trazendo atributos no argumento
			DadosFuncionarios objDados = new DadosFuncionarios( id,  nome,  salario);
			
			//adicionando meu objeto na lista
			list.add(objDados);
			
			
		}
		
		
		System.out.print("Digite o ID do funcionario que deseja adicionar porcentagem:");
		int idSalario = sc.nextInt();
		
		Integer posInteger = buscandoPosicaoId(list, idSalario);
		
		if(posInteger == null) {
			System.out.print("ID não existe!");
		}else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			list.get(posInteger).incrementoSalario(porcentagem);
			/*acessar na lista, o funcionario que esta na posição que foi encontrada no (buscarPosicaoId) = posInteger, 
			 * e chamar a função que vai fazer o aumento de salario dele
			 */
		}
		
		

		
		
		System.out.println("Lista de funcionariso:");
		for(DadosFuncionarios e : list) {
			System.out.println(e);
		}
		
		
		
		sc.close();
		
		
	}
	
	public static  Integer buscandoPosicaoId(List <DadosFuncionarios> list, int id) {
		for(int i=0; i < list.size(); i++) {//começa na posição 0, passa por cada uma até o tamanho total d alista
			if(list.get(i).getId() == id){
				return i;
				//produra ID que foi passado no argumento , se encontra retorna a posição
			}
			
		}
		return null;//se não retorna null , logo não tem o  id, não existe!
	}
	

}
