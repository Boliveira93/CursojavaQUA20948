package vilao;

import java.util.Locale;
import java.util.Scanner;

import entities.VilaoMarvel;

public class Herois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		VilaoMarvel  heroismarvel = new VilaoMarvel(" Professor Luan", "Barba Ruiva", "Mundo Java", "Alunos Perdidos", "Taguatinga", "Senai", "Frita Cerebro", 29, "Ativo");
		
		System.out.println(heroismarvel);
		
		sc.close();
		
		
		
		
		

	}

}
