package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carros;
import entities.Clientes;

public class ProgramTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Carros c1;

		Clientes clientes;

		ArrayList<Carros> carros = new ArrayList<>();
		char opt;

		System.out.println("Deseja cadastrar um veiculo?(s/n)");
		opt = sc.next().charAt(0);

		while (Character.toLowerCase(opt) == 's') {

			try {
				clientes = new Clientes();
				c1 = new Carros();

				sc.nextLine();
				System.out.println(" ### DADOS DO CLIENTE ### \n");

				System.out.print("Entre com o nome do Cliente: ");
				clientes.setNome(sc.nextLine());

				System.out.print("Entre com o Telefone do Cliente: ");
				clientes.setTelefone(sc.nextLine());

				System.out.print("Entre com o Endereco do Cliente: ");
				clientes.setEndereco(sc.nextLine());

				System.out.print("Entre com o CPF do Cliente: ");
				clientes.setCpf(sc.nextLine());

				System.out.print("\n ### DADOS DO VEICULO ###\n");

				System.out.print("Entre com o Modelo do Veiculo: ");
				c1.setModelo(sc.nextLine());

				System.out.print("Entre com o Ano do Veiculo: ");
				c1.setAno(sc.nextInt());

				sc.nextLine();
				System.out.print("Entre com a Cor do Veiculo: ");
				c1.setCor(sc.nextLine());

				System.out.print("Entre com o tipo do veiculo (hatch/sedan/camin): ");
				c1.setTipo(sc.nextLine());

				System.out.print("Entre com o tipo de Cambio (m/a):  ");
				c1.setCambio(sc.next().charAt(0));

				sc.nextLine();
				System.out.print("carro novo ou usado: ");
				c1.setCarroNovoOuUsado(sc.nextLine());

				System.out.print("Entre com o tipo do combustivel (g/a): ");
				c1.setTipoCombustivel(sc.next().charAt(0));

				System.out.print("Entre com o valor do veiculo: ");
				c1.ValorCompra(sc.nextDouble());

				System.out.print("Dados do carro cadastrado com valor de venda:\n");
				System.out.println(c1);

				carros.add(c1);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			System.out.println("Deseja cadastrar um veiculo?(s/n)");
			opt = sc.next().charAt(0);
		}
		System.out.println("Ok! Até a Próxima.");
		sc.close();

	}

}
