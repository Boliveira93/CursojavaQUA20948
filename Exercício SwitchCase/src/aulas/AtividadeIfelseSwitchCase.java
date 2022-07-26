package aulas;

import java.util.Scanner;

public class AtividadeIfelseSwitchCase {

	public static void main(String[] args) {

		// Faça um programa que peça ao usuário para escolher o item de um menu e a
		// quantidade:

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha um item do Menu: ");
		int menu = leia.nextInt();

		switch (menu) {
		case 1:
			System.out.println(" Você escolheu Sanduiche Natureba");
			break;

		case 2:
			System.out.println(" Você escolheu Sanduba Bomba");
			break;

		case 3:
			System.out.println(" Você escolheu Coxinha de Jaca");
			break;

		case 4:
			System.out.println(" Você escolheu Feijoada Vegetariana");
			break;

		}

		System.out.println("Saiu do Switch case!");

		/*
		 * Faça um programa que peça ao usuário para digitar um numero entre 1 e 7 não
		 * podendo ser maior e nem menor. O numero que a pessoa escolher representará um
		 * dia da semana (a semana começa no domingo).
		 */

		System.out.println("Digite um Numero entre 1 e 7: ");
		int dia = leia.nextInt();

		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Seg");
			break;
		case 3:
			System.out.println("Ter");
			break;
		case 4:
			System.out.println("Qua");
			break;
		case 5:
			System.out.println("Qui");
			break;
		case 6:
			System.out.println("Sex");
			break;
		case 7:
			System.out.println("Sab");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}

		Scanner in = new Scanner(System.in);

		String login;
		String loginCadastrado = "Boliveira";
		int senha = 0;
		int senhaCadastrada = 10;

		System.out.println("Digite seu login: ");
		login = in.nextLine();

		System.out.println("Digite sua senha: ");
		senha = in.nextInt();

		if (login.equals(loginCadastrado)) {
			System.out.println("CADASTRADO COM SUCESSO!");
		} else {
			System.out.println("LOGIN E SENHAS INCORRETO");
		}
		
		double salarioBruto = 0.0;
		double salarioLiquido = 0.0;
		double inss = 0.11;
		double irpf = 0.05;
		
		System.out.println("Entre com salario Bruto: ");
		salarioBruto = leia.nextDouble();
		
		salarioLiquido = salarioBruto - ((salarioBruto * inss) + (salarioBruto * irpf));
		if(salarioLiquido < 1200.00) {
			salarioLiquido += salarioLiquido * 0.05;
		}else if(salarioLiquido > 3500.00) {
			salarioLiquido += salarioLiquido * 0.02;
		}
		
		System.out.println("Salario Atualizado: " + salarioLiquido);

		leia.close();
		in.close();
	}
	
		
		
	
	
}
