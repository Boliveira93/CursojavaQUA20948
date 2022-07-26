package aulas;

import java.util.Locale;
import java.util.Scanner;

public class SextoExercicio {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor 
		 seja inválido e continue pedindo até que o usuário informe um valor	válido.*/
		
		int nota = 0;
		
		System.out.print("Informe sua nota (Entre zero e dez): ");
		nota = scan.nextInt();
		while(nota < 0 || nota > 10) {
			System.out.println("Insira uma nota valida");
			System.out.print("\nInforme sua nota (Entre zero e dez): ");
			nota = scan.nextInt();
		}
		System.out.println("A nota inserida foi: " + nota + "\n");
		
		/*2. Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.*/
		
		
		String login;
		String senha;
		
		System.out.println("Insite o seu Login: ");
		login = scan.nextLine();
		
		scan.nextLine();
		System.out.println("Insira sua senha: ");
		senha = scan.nextLine();
		
		while(login.equals(senha)) {
			System.out.println("\nO login e senha devem ser diferente!!");
			System.out.println("\nInsira o login do usuario: ");
			login = scan.nextLine();
			scan.nextLine();
			System.out.println("Insira sua senha: ");
			senha = scan.nextLine();
		}
		
		System.out.println("\nDados Cadastrados com Suceso!!");
		System.out.printf("login: %s | Senha %s", login, senha + "\n");
		
		/*3. Faça um programa que leia e valide as seguintes informações:
		A.Nome:
		maior que 3 caracteres;
		
		B.Idade:
		entre 0 e 150;
		
		C.Salário:
		maior que zero;
		
		D.Sexo:
		'f' ou 'm';
		
		E.Estado Civil: 
		's', 'c', 'v', ‘d’;*/
		
		String nome;
		int idade = 0;
		double salario = 0;
		char sexo = 0;
		char estadoCivil;
		
		System.out.println("\nPreencha o formulario!");
		
		System.out.print("Digite o seu nome: ");
		nome = scan.nextLine();	
		
		while(nome.length()<= 3) {
			System.out.println("Digite um nome valido!");
			System.out.print("Digite o seu nome: ");
			nome = scan.nextLine();
			
		}
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		while(idade < 0 || idade > 150) {
			System.out.println("Digite uma idade valida!");
			System.out.print("Digite sua idade: ");
			idade = scan.nextInt();
		}
		System.out.print("Digite o valor do seu salario R$: ");
		salario = scan.nextDouble();
		while(salario < 0) {
			System.out.println("Digite um valor valido!");
			System.out.print("Digite o valor do seu salario R$: ");
			salario = scan.nextDouble();
		}
		System.out.print("Informe o seu sexo (f ou m): ");
		sexo = scan.next().charAt(0);
		while(sexo != 'f' && sexo != 'm') {
			System.out.println("Digite o sexo conforme solicitado!");
			System.out.print("Informe o seu sexo (F ou M): ");
			sexo = scan.next().charAt(0);
		}
		System.out.print("Digite seu estado civil (s > Solteiro(a), c > Casado(a), v > Viuvo(a), d > Divorciado(a): ");
		estadoCivil = scan.next().charAt(0);
		while(estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
			System.out.println("Insira os dados conforme solicitado acima!");
			System.out.print("Digite seu estado civil (s > Solteiro(a), c > Casado(a), v > Viuvo(a), d > Divorciado(a): ");
			estadoCivil = scan.next().charAt(0);
		}
		System.out.println("Formulario preenchido com sucesso!!!");
		System.out.printf("\nNome: " + nome + " | Idade: " + idade + "anos | Sexo: " + sexo +  " | Estado Civil: " + estadoCivil + " | Salario R$: " + salario + " reais");
		
		scan.close();
		
		
	}
	
	
	
	
	
	

}
