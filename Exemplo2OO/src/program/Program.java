package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Produto produto = new Produto("Maçã",10, 0.50);
		
		System.out.println(produto);
		
		/*System.out.print("Entre com o nome do produto:");
		String nome = sc.nextLine();
		
		System.out.print("Entre com a quantidade do produto:");
		int quantidade = sc.nextInt();
		
		System.out.print("Entre com o valor unitario do produto:");
		double valor = sc.nextDouble();
		
		
		
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
		System.out.println(produto);*/
		
		
		
		sc.close();

	}

}
