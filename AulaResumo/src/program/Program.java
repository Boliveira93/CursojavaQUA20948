package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import entities.Clientes;
import entities.Conta;
import entities.ContaException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		try {
			Conta conta = new Conta();

			Conta conta2 = new Conta();

			Clientes cliente = new Clientes();

			System.out.println("Entre com o Número da Conta: ");
			conta.setNumeroConta(sc.nextInt());

			sc.nextLine();
			System.out.println("Entre com o Titular: ");
			cliente.setNome(sc.nextLine());
			conta.setTitularDaConta(cliente);

			System.out.println("Entre com a Agencia: ");
			conta.setAgencia(sc.nextInt());

			System.out.println("Saldo: " + conta.getSaldo());

			System.out.println("Deseja depositar algum valor?");
			System.out.println("Qual o valor do Depoisito: ");
			conta.Depositar(sc.nextDouble());

			System.out.println("Saldo Atualizado: " + conta.getSaldo());

			System.out.println(conta.getAgencia() + " " + conta.getNumeroConta() + " " + conta.getTitularDaConta() + " "
					+ conta.getSaldo());

			System.out.println("Conta do Ana, Saldo: " + conta2.getSaldo());

			System.out.println("Qual o valor que você vai transfeirir: ");
			double valor = sc.nextDouble();
			conta.Transferir(valor, conta2);

			System.out.println("Saldo: " + conta2.getSaldo());

		} catch (ContaException e) {
			System.out.println("Erro: " + e.getMessage());
		} catch (MissingFormatArgumentException e2) {
		} catch (InputMismatchException e3) {
			System.out.println("Tipo Incopativel, vc digitou uma letra");
		}
		sc.close();

	}

}
