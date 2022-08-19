package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class ProgramTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Carro carro;
		Moto moto = new Moto();

		ArrayList<Veiculo> carros = new ArrayList<>();
		ArrayList<Veiculo> motos = new ArrayList<>();

		char opcao;

		System.out.println("Você deseja cadastra um veiculo (s/n)");
		opcao = sc.next().charAt(0);

		while (Character.toLowerCase(opcao) == 's') {

			System.out.println("Qual tipo de Veiculo quer Cadastrar (c/m)");
			opcao = sc.next().charAt(0);

			switch (Character.toLowerCase(opcao)) {
			case 'c':
				carro = new Carro();
				sc.nextLine();
				System.out.println("Entre com o tipo do veiculo: ");
				carro.setTipo(sc.nextLine());

				System.out.println("Entre com o tipo do Combustivel: ");
				carro.setTipoCombustivel(sc.nextLine());

				System.out.println("Entre com a potencia do carro: ");
				carro.setMotor(sc.nextLine());

				System.out.println("Entre com o modelo: ");
				carro.setModelo(sc.nextLine());

				System.out.println("Entre com a quantidade de passageiros: ");
				carro.setQtdPassageiros(sc.nextInt());

				System.out.println("Entre com a quantidade de pneus: ");
				carro.setQtdPneus(sc.nextInt());

				sc.nextLine();
				System.out.println("Entre com o Modelo do Som (Básico/Multimidia: ");
				carro.setSonorizacao(sc.nextLine());

				System.out.println("Entre com o Modelo do ar condicionado (manual/digital): ");
				carro.setArCondicionado(sc.nextLine());

				carros.add(carro);

				break;

			default:
				System.out.println("Tipo incopativel!");
				break;
				
				while (Character.toLowerCase(opcao) == 's') {
					
				}
				
				
				System.out.println("Qual tipo de Veiculo quer Cadastrar (c/m)");
				opcao = sc.next().charAt(0);
			case 'm':
				
			}

		}

		for (Veiculo listaCarros : carros) {
			System.out.println(listaCarros);
		}

	}

}
