package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//variáveis
		int num1;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe um número: ");
		num1 = teclado.nextInt();
		
		//processamento
		if(num1 > 100) {
			System.out.println(num1);
		}else {
			num1 = 0;
			System.out.println(num1);
		}
		teclado.close();
	}

}
