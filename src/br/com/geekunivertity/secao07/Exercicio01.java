package br.com.geekunivertity.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//variáveis
		int num, maior = 0;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número: ");
		num = teclado.nextInt();
				
		//processamento
		while(num != 0) {
			if(num > maior) {
				maior = num;
			}
			System.out.println("Informe um número: ");
			num = teclado.nextInt();
			
		}
		System.out.printf("O maior número é %d", maior);
		teclado.close();

	}

}
