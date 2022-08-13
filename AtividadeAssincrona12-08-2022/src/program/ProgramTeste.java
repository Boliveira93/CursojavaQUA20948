package program;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class ProgramTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Carro c1 = new Carro();

		Moto m1 = new Moto();
		
		Veiculo v1 = new Veiculo();

		ArrayList<Carro> carros = new ArrayList<>();

		char opt;
		System.out.print("Cadastrar Caracteristicas do Carro/Moto(s/n):  ");
		opt = sc.next().charAt(0);

		while (Character.toLowerCase(opt) == 's') {
			sc.nextLine();
			System.out.print("Quantos Pneus tem um Carro: ");
			c1.setQtdPneusCarro(sc.nextLine());
			
			System.out.println("Quantos Pneus tem uma Moto: ");
			m1.setQtdPneusMoto(sc.nextLine());
			
			System.out.println("Quantas Cilindrada tem uma Moto: ");
			m1.setQtdCilindrada(sc.nextLine());

			System.out.print("Quantos Cavalos: ");
			c1.setQtdCavalos(sc.nextDouble());
			
			System.out.println("Quantos Passageiros em uma Moto: ");
			m1.setQtdPassageiroMoto(sc.nextLine());

			sc.nextLine();
			System.out.print("Quantos Passageiros do Carro: ");
			c1.setQtdPassageiroCarro(sc.nextLine());

			System.out.print("Qual o tipo de Combustivel: ");
			c1.setTipoCombustivel(sc.nextLine());

			System.out.print(" \n### CARACTERISTICAS OBTIDAS ###:\n");
			System.out.println(v1);

			System.out.print("\nCadastrar Caracteristicas do Carro(s/n):  \n");
			opt = sc.next().charAt(0);
		}
		System.out.println("Ok. Até a Próxima!");
		sc.close();

	}

}
