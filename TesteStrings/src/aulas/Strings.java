package aulas;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "Aula Java professor Luan dia vite e seis";

		char caractere = 's';

		System.out.println(frase.length());// contaa qtd de caracteres inclusive os em branco
		System.out.println(frase.charAt(6));// localiza o caractere na posição indicada
		System.out.println(frase.lastIndexOf("J"));// localiza a ultima ocorrencia do caractere
		System.out.println(frase.concat("     foi concatenado"));// concatena strings
		System.out.println(frase.contentEquals("Aula"));//compara se o conteudo da string é igual ao conteudo passado no parametro
		System.out.println(frase.endsWith("a"));//ultima ocorrencia da string e compara se é igual ao parametro passado
		System.out.println(frase.trim().endsWith("s"));
		System.out.println(frase.trim());// remove espaços em branco no inicio e no final da string
		System.out.println(frase.toLowerCase());//coloca todas as letras da string em letras minusculas
		System.out.println(frase.toUpperCase());//coloca todas as letras da strings em letras maiuscula
		System.out.println(frase.replace("a", "b"));// altera um letra por outra passada como referencia
		System.out.println(frase.replace("Luan","Muruk"));//altera conjunto de caracteres
		System.out.println(frase.replaceAll("a", "A"));
		frase = "";
		System.out.println(frase.isEmpty());//verifica se a string contem valor retorna verdadeiro ou falso
		double x = 1254.36598;
		System.out.println(String.format("%.2f", x));
		
		System.out.println(Character.toUpperCase(caractere));//converte para letra maiuscula
		System.out.println(Character.toLowerCase(caractere));// converte para letra minuscula
		
		
		sc.close();

	}

}
