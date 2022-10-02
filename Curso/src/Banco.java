import java.util.Scanner;

import entites.conta_bancaria;

public class Banco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do titular da conta: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o numero da conta: ");
		int numero_conta = sc.nextInt();
		
		System.out.print("Deseja realizar um  despodito?(y/n): ");
		char realizar_depostio = sc.next().charAt(0);
		System.out.println();
		conta_bancaria conta;


		if (realizar_depostio == 'y') {
			System.out.print("Digite o valor do depostio: ");
			double valor_deposito = sc.nextDouble();
			conta = new conta_bancaria(nome, numero_conta, valor_deposito);
			
		} else {
			conta = new conta_bancaria(nome, numero_conta);
		}
		
		System.out.println(conta);
		System.out.println();
		System.out.print("Digite o valor que deseja adcionar: ");
		double add = sc.nextDouble();
		conta.add_deposito(add);
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Digite o valor que deseja saca: ");
		double saque = sc.nextDouble();
		conta.saques(saque);

		System.out.println(conta);

		sc.close();
	}

}
