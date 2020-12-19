package br.com.geekuniversity.secao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//variáveis
		int vetor[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		for(int i = 0; i < 10; i++){
			System.out.println("Digite um número: ");
			vetor[i] = teclado.nextInt();
		}
		for (int i = (vetor.length -1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();				
	}

}
