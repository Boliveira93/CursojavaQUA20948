package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		Produto produto = new Produto();
		
		System.out.print("Entre com o nome do produto:");
		produto.nomeProduto = sc.nextLine();
		
		System.out.print("Entre com a quantidade do produto:");
		produto.quantidade = sc.nextInt();
		
		System.out.print("Entre com o valor unitario do produto:");
		produto.valor = sc.nextDouble();
		
		/*System.out.print("Produto: " + produto.nomeProduto);
		System.out.print("\nQuantidade: " + produto.quantidade);
		System.out.print("\nValor unitario: " + produto.valor + "\n");
		produto.Estoque();
		System.out.println("\n\n\n" + produto);*/
		
		System.out.println(produto);
		
		
		
		sc.close();

	}

}
