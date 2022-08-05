package herois;

import java.util.Locale;
import java.util.Scanner;

import entities.HeroisMarvel;

public class Herois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		HeroisMarvel  heroismarvel = new HeroisMarvel(" Professor Luan", "Barba Ruiva", "Mundo Java", "Alunos Perdidos", "Taguatinga", "Senai", "Frita Cerebro", 29, "Ativo");
		
		System.out.println(heroismarvel);
		
		sc.close();
		
		
		
		
		

	}

}
