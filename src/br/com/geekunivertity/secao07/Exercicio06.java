package br.com.geekunivertity.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//Variáveis
		int Num, Valor;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe um número: ");
		Num = teclado.nextInt();
		while(Num > 10) {
			System.out.println("O número deve ser menor do que 10");
			System.out.println("Informe um número: ");
			Num = teclado.nextInt();
		}
		System.out.println("Tabuada do " + Num);
		for(int i = 0; i<= 10; i++) {
			Valor = Num * i;
			System.out.println(Num + " X " + i + " = " + Valor);
		}
		teclado.close();
		
	}

}
