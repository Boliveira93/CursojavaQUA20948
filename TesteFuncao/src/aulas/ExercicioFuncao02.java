package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFuncao02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double gasolina = 0.0;
		double alcool = 0.0;
		
		
		System.out.println("Entre com o valor da Gasolina: ");
		gasolina = sc.nextDouble();
		System.out.println("Entre com o valor do Alcool: ");
		alcool = sc.nextDouble();
		
		GasOuAlc(alcool, gasolina);
		
		sc.close();
	}

	
	public static void GasOuAlc(double a, double g) {
		if(a / g >= 0.70) {
			System.out.println("Compensa colocar Gasolina!");
		}else {
			System.out.println("Compensa colocar Alcool!");
		}
	}
}
