package aulas;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/*int[] numero = new int[5];// declara a quantidade de posições do array
		int [] numero2 = {1,25,10};// inicializa o array
		
		System.out.println(numero2[1]);// obtem o valor do array no indice indicado
		System.out.println(numero[4]);// resultado vai ser zero
		System.out.println(numero.length);// obtem o tamanho do 
		
		System.out.println("Entre com a quantidade:");
		int qtd = sc.nextInt();
		
		int[] passadoTeclado = new int[qtd];
		
		System.out.println("Quantidade de posiçoes: " + passadoTeclado.length);*/
		
		int[] numeros = {1, 10, 25, 9, 50};
		
		/*for(int i = 0; i < numeros.length; i++) {
			System.out.println("Posição: " + i + ", Valor do arrya: " + numeros[i]);
		}*/
		// for each: para até;
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		sc.close();
		
	}

}
