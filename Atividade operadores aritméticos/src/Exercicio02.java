import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// •Faça um Programa que peça dois
		//números e imprima a soma;
		
		int n1 = 10;
		int n2 = 20;
		
		int resultado = n1+n2;
		System.out.println(resultado);
		
		//um Programa que peça as 4 notas bimestrais e mostre a média.
		double nota1 = 10;
		double nota2 = 9;
		double nota3 = 8;
		double nota4 = 7;
		double media = (nota1+nota2+nota3+nota4)/4;
		System.out.println(media);
		
		/*um Programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/
		
		float valordahora;
		int horastrabalhadas;
		int quantidadededias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quanto ganha por hora: ");
		valordahora = leia.nextFloat();
		
		System.out.println("Quantas horas trabalhadas: ");
		horastrabalhadas = leia.nextInt();
		
		System.out.println("Quantidade de Dias: ");
		quantidadededias = leia.nextInt();
		
		System.out.println("O meu salario, em um mes é de: " + ( valordahora * horastrabalhadas) * quantidadededias );
		
		//um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a
		//temperatura em graus Celsius.
		double grausfah = 0.00;
		double celsius = 0.00;
		
		System.out.println("Insira a temperatura em graus Fahrenheit: ");
		grausfah = leia.nextDouble();
		
		celsius = 5.0 * (grausfah-32.0) / 9.0;
		
		System.out.println("A temperatura em graus Celsius é de: " + celsius);
		
		

	}

}
