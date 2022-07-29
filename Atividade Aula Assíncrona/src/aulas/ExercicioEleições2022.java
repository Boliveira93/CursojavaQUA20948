package aulas;

import java.util.Scanner;

public class ExercicioEleições2022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int voto;
		int lulaMolusco = 0;
		int bolsoNelson = 0;
		int ciloucaGomes = 0;
		int bolosBolinho = 0;
		int votoNulo = 0;
		
		System.out.println(" ### ELEIÇÕES 2022 ### \n");
		
		System.out.println(" ### LISTA DE CANDIDATOS ### \n");
		System.out.println(" ### OPÇÃO 1 - LULA MOLUSCO ###");
		System.out.println(" ### OPÇÃO 2 - BOLSO NELSON ###");
		System.out.println(" ### OPÇÃO 3 - CILOUCA GOMES ###");
		System.out.println(" ### OPÇÃO 4 - BOLOS BOLINHO ### \n");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("ESCOLHA SUA OPÇÃO DE VOTO: ");
			voto = sc.nextInt();
			
			switch(voto) {
			
			case 1:
				System.out.println("SEU VOTO FOI PARA (LULA MOLUSCO)");
				lulaMolusco++;
				break;
			case 2:
				System.out.println("SEU VOTO FOI PARA (BOLSO NELSON) ");
				bolsoNelson++;
				break;
			case 3:
				System.out.println("SEU VOTO FOI (CILOUCA GOMES) ");
				ciloucaGomes++;
				break;
			case 4:
				System.out.println("SEU VOTO FOI (BOLOS BOLINHO");
				bolosBolinho++;
				break;
			default:
				System.out.println(" VOCÊ VOTOU NULO ");
				votoNulo++;
				
			}
		}
		System.out.println(" ### QUANTIDADE DE VOTOS ### \n");
		System.out.println("QUANTIDADE DE VOTOS Lula Molusco: "+ lulaMolusco);
		System.out.println("QUANTIDADE DE VOTOS Bolso Nelso: "+ bolsoNelson);
		System.out.println("QUANTIDADE DE VOTOS Cilouca Gomes: "+ ciloucaGomes);
		System.out.println("QUANTIDADE DE VOTOS Bolos Bolinho: "+ bolosBolinho);
		System.out.println("QUANTIDADE DE Nulos: "+ votoNulo);
		
		
		

	}

}
