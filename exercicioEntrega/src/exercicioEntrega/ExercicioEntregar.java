package exercicioEntrega;

import java.util.Scanner;

public class ExercicioEntregar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		int idade;
		char sexo;
		double saldo;
		
		System.out.println("Meu Nome: ");
		nome = leia.nextLine();
		
		System.out.println("Minha idade é: ");
		idade = leia.nextInt();
		
		System.out.println("Meu sexo é: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("Meu saldo bancario: ");
		saldo = leia.nextDouble();
		
		System.out.println("Meu nome é " + nome + " tenho " + idade + " meu sexo " + sexo + " meu saldo bancario é: " + saldo);
		
		leia.close();
	}

}
