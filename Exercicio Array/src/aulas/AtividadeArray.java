package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AtividadeArray {

	public static void main(String[] args) {
		
		
		//1. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		/*double[] notas = new double[4];
		double media = 0;
		
		System.out.println(" ### NOTAS DO ALUNO ### \n");
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("Digite a %dª nota: ", (i+1));
			notas[i] = sc.nextDouble();
		}
		for(double nota : notas) {
			System.out.println(nota + ", ");
		}
		
		media =  (notas[0] + notas[1] + notas[2] + notas[3])  / 4;
		
		System.out.printf(" \n %.2f A Media do Aluno Foi: " , media);*/
		
		/*Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no
		 seu respectivo vetor. Imprima a idade e a altura na ordem*/
		
		int[] idades = new int[5];
		double[] alturas = new double[5];
		int cont = 1;
		int cont2 = 1;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("\nDigite a %dª Idade: ", (i+1));
			idades[i] = sc.nextInt();
			System.out.printf("Digite a %dª sua Altura: ", (i+1));
			alturas[i] = sc.nextDouble();
		}
			
		for(int idade : idades) {
				System.out.println(cont++ + "ª idade "+ idade + " anos");	
		}
		for(double altura : alturas) {
			System.out.println(cont2++ + "ª altura " + altura + " cm");
		}
		
		sc.close();
		
		
		
		
		
		
		

	}

}
