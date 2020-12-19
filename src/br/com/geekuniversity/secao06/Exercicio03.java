package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//variáveis
		int numero;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe um número: ");
		numero = teclado.nextInt();
		
		//processamento
		if(numero % 2 == 0){
			System.out.println("Número par");			
		}else {
			System.out.println("Numero impar");
		}
		teclado.close();
	}

}
