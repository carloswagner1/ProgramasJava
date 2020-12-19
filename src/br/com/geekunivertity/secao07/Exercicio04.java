package br.com.geekunivertity.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//variáveis
		float Nota = 0, Maior = 0, Menor = 10, Soma = 0, NotaFinal;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		for(int i = 0; i < 5; i++){
			System.out.println("Informa a Nota: ");
			Nota = teclado.nextFloat();
					
			if(Nota > 0) {
				if(Nota > Maior) {
					Maior = Nota;
				}
				if(Nota < Menor) {
					Menor = Nota;
				}
				Soma = Soma + Nota;
			}else {
				i--;
			}
		}
		NotaFinal = Soma - (Maior + Menor);
		System.out.printf("A nota é %.1f: ", NotaFinal);
		teclado.close();
	}
}
