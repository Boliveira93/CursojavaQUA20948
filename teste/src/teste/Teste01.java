package teste;

import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String login;
		String senha;

		System.out.println("Insite o seu Login: ");
		login = scan.nextLine();

		scan.nextLine();
		System.out.println("Insira sua senha: ");
		senha = scan.nextLine();

		while (login.equals(senha)) {
			System.out.println("\nO login e senha devem ser diferente!!");
			System.out.println("\nInsira o login do usuario: ");
			login = scan.nextLine();
			scan.nextLine();
			System.out.println("Insira sua senha: ");
			senha = scan.nextLine();
		}
		System.out.println("Login: " + login + " Senha: " + senha);
		scan.close();

	}

}
