package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Produto produto = new Produto();

		System.out.print("Entre com o nome do produto:");
		String nome = sc.nextLine();
		produto.SetNomeProduto(nome);
		
		System.out.println(produto.GetNomeProduto());

		/*System.out.print("Entre com a quantidade do produto:");
		produto.quantidade = sc.nextInt();*/
		

		System.out.print("Entre com o valor unitario do produto:");
		double valor = sc.nextDouble();
		produto.setValor(valor);

		System.out.println(produto);

		System.out.println("Entre com a quantidade a ser adicionada: ");
		int qdt = sc.nextInt();
		produto.AdicionarItem(qdt);

		System.out.println("Estoque atualizado: ");
		System.out.println(produto);

		System.out.println("Entre com a quantidade a ser removida: ");
		qdt = sc.nextInt();
		produto.RemoverItem(qdt);

		System.out.println("Estoque atualizado: ");
		System.out.println(produto);

		sc.close();

	}

}
