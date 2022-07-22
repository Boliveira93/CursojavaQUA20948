package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosTeclado {

	public static void main(String[] args) {
		//ctr+shift+o importa automaticamente
		
		
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int numero = 0;
		char sexo;
		double x = 10.25;
		
		System.out.println("Entre com um Nome:");
		nome = leia.nextLine();
		
		System.out.println("entre com um numero inteiro: ");
		numero = leia.nextInt();
		
		System.out.println("Entre com sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("x está valendo: "+ + x);
		
		System.out.println("Insira um valor para a variavel x: ");
		x = leia.nextDouble();
		
		System.out.println(" ---------------- ");
		System.out.println("Nome: " + nome);
		System.out.println("Numero: " + numero);
		System.out.println("Sexo: " + sexo);
		
		System.out.println("O valor de x agora está valendo: " + x);

		leia.close();
	}

}
