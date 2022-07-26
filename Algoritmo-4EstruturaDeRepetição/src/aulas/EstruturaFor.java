package aulas;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Usamos quando já sabemos a quantidade de vezes que queremos executa
		// determinada condição

		for (int contador = 0; contador <= 10; contador++) {
			System.out.println("O contador esta valendo: " + contador);
		}

		System.out.println(" ---------------- ");

		int i = 0;
		// Usamos quando não sabemos a quantidade de vezes que precisamos
		// executa determinado bloco de codigo
		while (i <= 10) {
			System.out.println("O contador do While está valendo: " + i);
			i++;
		}
		// Usamos quando queremos que o bloco de codigo seja executato ao menos uma vez
		do {
			System.out.println("O contador do while esta valando: " + i);
			i++;

		} while (i <= 10);

		int condicao = 0;
		int somar = 0;

		System.out.println("Entre com numero 1 para S e 2 para N");
		condicao = sc.nextInt();

		/*while (condicao == 1) {
			System.out.println("Apertou 1");
			System.out.println("Entre com numero 1 para S e 2 para N");
			condicao = sc.nextInt();
			somar++;
		}*/
		
		do {
			System.out.println("Entre com numero 1 para S e 2 para N");
			condicao = sc.nextInt();
			
		}while(condicao == 1);
			
		System.out.println("Saiu do bloco de repeticao! repetiu: " + somar);

	}
	 
	
		
	}

	
