import java.util.Scanner;

import entites.ajust_funcionario;

public class dados_funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do usuario");
		ajust_funcionario dados;
		dados = new ajust_funcionario();
		System.out.print("Nome: ");
		dados.name = sc.next();
		
		System.out.print("Salario Bruto: ");
		dados.salario = sc.nextDouble();
		
		System.out.print("Imposto: ");
		dados.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.println(dados.toString());
		System.out.println();
		
		System.out.print("Qual a portcentagem que deseja aumenta no salario: ");
		double add = sc.nextDouble();
		dados.add_ajust(add);
		
		System.out.println();
		System.out.println("Dados atualizados: Nome: " + dados.name+ " Salario: " + String.format("%.2f", dados.salario));
	}


	}


