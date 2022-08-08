package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Conta conta = new Conta();

		System.out.println("Entre com o Número da Conta: ");
		conta.setNumeroConta(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Entre com o Titular: ");
		conta.setTitularDaConta(sc.nextLine());

		System.out.println("Entre com a Agencia: ");
		conta.setAgencia(sc.nextInt());

		System.out.println("Saldo: " + conta.getSaldo());
		
		System.out.println("Deseja depositar algum valor?");
		System.out.println("Qual o valor do Depoisito: ");
		conta.Depositar(sc.nextDouble());
		
		System.out.println("Saldo Atualizado: " + conta.getSaldo());
		
		
		
		System.out.println(conta.getAgencia() + " " + conta.getNumeroConta() + " " + conta.getTitularDaConta() + " " + conta.getSaldo());
		
		sc.close();

	}

}
