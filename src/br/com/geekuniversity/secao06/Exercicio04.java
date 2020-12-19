package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//variáveis
		float Altura, PesoIdeal = 0;
		char Sexo;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe a sua altura: ");
		Altura = teclado.nextFloat();
		System.out.println("Informe o sexo (m/f): ");
		Sexo = teclado.next().charAt(0);
		
		//processamento
		if(Sexo == 'm'){
 			PesoIdeal = (float)(72.7 * Altura) - 58;
 			System.out.printf("O Peso Ideal é %.2f", PesoIdeal);
		}else if(Sexo == 'f'){
			PesoIdeal = (float)(62.1 * Altura) - (float)44.7;
			System.out.printf("O Peso Ideal é %.2f", PesoIdeal);
		}else if(Sexo != 'm' && Sexo != 'f') {
			System.out.println("Sexo não reconhecido.");
		}
		teclado.close();
		
	}
}
