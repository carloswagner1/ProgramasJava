package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		//variáveis
		int QuantidadeMinima, QuantidadeMaxima;
		float EstoqueMedio;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe a quantidade mínima: ");
		QuantidadeMinima = teclado.nextInt();
		
		System.out.println("Informe a quantidade máxima: ");
		QuantidadeMaxima = teclado.nextInt();
		
		//processamento
		EstoqueMedio = (QuantidadeMinima + QuantidadeMaxima) / 2;
		
		
		//saída
		System.out.println("O estoque médio é: " + EstoqueMedio);
		
		teclado.close();
	}

}
