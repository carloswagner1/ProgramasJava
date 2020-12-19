package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//variáveis
		float Altura;
		double PesoIdeal;
		Scanner teclado = new Scanner(System.in);
				
		//entrada
		System.out.println("Informe a sua altura: ");
		Altura = teclado.nextFloat();
		
		//processamento
		PesoIdeal = (Altura * 72.7) - 58;
		
		//Saída
		System.out.println("Seu peso ideal é " + PesoIdeal);
		
		teclado.close();

	}

}
