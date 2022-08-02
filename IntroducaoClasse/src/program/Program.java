package program;

import java.util.Scanner;

import entity.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoa pessoa = new Pessoa(); 
		
		System.out.println("Entre com o Nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.println("Entre com a Idade: ");
		pessoa.idade = sc.nextInt();
		
		System.out.println("Entre com o Sexo: ");
		pessoa.sexo = sc.next().charAt(0);
		
		System.out.println(pessoa.nome + " " + pessoa.idade + " " + pessoa.sexo);
		
		sc.close();

	}

}
