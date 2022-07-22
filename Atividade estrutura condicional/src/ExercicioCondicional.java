import java.util.Scanner;

public class ExercicioCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// um programa que leia dois números e imprima o maior deles
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.println("Entre com segundo numero: ");
		n2 = leia.nextInt();
		
		if(n1 > n2) {
			System.out.println("Maior numero: " + n1);
		}else {
			System.out.println("Maior numero: " + n2);
		}
		
		
		//um programa que leia 3 números e mostre o maior deles
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Entre com num1: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o num2 ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com num3 ");
		num3 = leia.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("MAIOR NUMERO: " + num1);
		}else if (num2 >= num1 && num2 > num3) {
			System.out.println("MAIOR NUMERO: " + num2);
		}else {
			System.out.println("MAIOR NUMERO: " + num3);
		}
			
		
		
		
		
		

	}

}
