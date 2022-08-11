package program;

import java.util.Scanner;

import entities.Carros;
import entities.Clientes;

public class ProgramTeste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Carros c1 = new Carros();
		
		Clientes clientes = new Clientes();

		System.out.println(" ### AUTOMOVEIS JAVA ### \n");
		
		
		System.out.println("Entre com o Modelo: ");
		c1.setModelo(sc.nextLine());
		
		System.out.println("Entre com Ano do Carro: ");
		c1.setAno(sc.nextInt());
		
		System.out.println("Entre com a Cor que deseja do Carro: ");
		c1.setCor(sc.nextLine());
		
		sc.nextLine();
		System.out.println("Entre com o tipo do Carro: ");
		c1.setTipo(sc.nextLine());
		
		System.out.println("Entre com o Cambio do Carro: ");
		c1.setCambio(sc.nextLine());
		
		System.out.println("O senhor(a) deseja Carro Novo ou Usado? ");
		c1.setCarroNovoOuUsado(sc.nextLine());
		
		System.out.println("Entre com o Valor do Carro: ");
		c1.setValor(sc.nextDouble());
		
		System.out.println("\nDADOS DO CARRO:" + c1);
		
		System.out.println("\nTEMOS ESSE CARRO EM ESTOQUE!");
		System.out.println("\nEntre com os DADOS pessoais para compra! ");
		
		sc.nextLine();
		System.out.println("Informe seu Nome:");
		clientes.setNome(sc.nextLine());
		
		System.out.println("Informe seu Endereço: ");
		clientes.setEndereco(sc.nextLine());
		
		System.out.println("Informe seu CPF: ");
		clientes.setCpf(sc.nextLine());
		
		System.out.println("informe seu Telefone: ");
		clientes.setTelefone(sc.nextLine());
		
		System.out.println("DADOS RECEBIDO COM SUCESSO!");
		
		System.out.println(clientes);
		System.out.println("PARABÉNS, CADASTRO APROVADO COM SUCESSO!");
		
		sc.close();
		
		
	}

}
