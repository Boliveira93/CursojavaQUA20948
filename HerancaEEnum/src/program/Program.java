package program;

import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Cliente cliente = new Cliente();
		
		Conta contaContacorrente = new ContaCorrente();
		Conta conta = new Conta();
		
		conta.Deposita(100);
		contaContacorrente.Sacar(200);
		
		conta.Sacar(50);
		contaContacorrente.Sacar(50);
		
		System.out.println("Saldo conta: " + conta.getSaldo());
		System.out.println("saldo conta corrente: " + contaContacorrente.getSaldo());
		
		
		
		
		/*
		System.out.print("Entre com nome do Titular: ");
		cliente.setNome(sc.nextLine());
		
		System.out.print("Entre com cpf do Titular: ");
		cliente.setCpf(sc.nextLine());
		
		contaContacorrente.setTitular(cliente);
		
		System.out.print("Entre com numero da Agencia: ");
		contaContacorrente.setAgencia(sc.nextInt());
		
		System.out.print("Entre com o numero da conta: ");
		contaContacorrente.setNumeroConta(sc.nextInt());
		
		System.out.print("Digite o valor do Deposito: ");
		contaContacorrente.Deposita(sc.nextDouble());
		
		System.out.print("CONTA CRIADA!\n");
		
		System.out.print(contaContacorrente);
		
		System.out.print("\nEntre com o valor do saque: ");
		contaContacorrente.Sacar(sc.nextDouble());
		
		System.out.println("Saldo atualizado: ");
		System.out.println(contaContacorrente);
		*/
		sc.close();

	}

}
