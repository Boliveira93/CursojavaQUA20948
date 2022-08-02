package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		double altura = 0.0;
		double peso = 0.0;
		int idade = 0;
		char sexo = 0;

		System.out.println("Entre com a Altura: ");
		altura = sc.nextDouble();
		System.out.println("Entre com Idade: ");
		idade = sc.nextInt();
		System.out.println("Entre com Peso: ");
		peso = sc.nextDouble();
		System.out.println("Entre com Sexo: ");
		sexo = sc.next().charAt(0);

		System.out.println(CalcularIMC(altura, peso, sexo));

	}

		public static String CalcularIMC(double a, double p, char s) {
		double imc = (p / (a * a));

		if (Character.toUpperCase(s) == 'M' && imc < 20.7) {
			return "abaixo do peso, imc " + imc;
		} else if (Character.toUpperCase(s) == 'M' && imc >= 20.7 && imc < 26.4) {
			return "Peso normal. imc : " + imc;
		}else if(Character.toUpperCase(s) == 'M' && imc >= 26.4 && imc < 27.8) {
			return "Marginalmente acima do peso, imc: " + imc;
		}else if(Character.toUpperCase(s) == 'M' && imc >= 27.8 && imc <31.1) {
			return "Acima do pedo ideal, imc: " + imc;
		}else {
			return "Obseso, imc: " + imc;
		}

	}
}
