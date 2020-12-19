package br.com.geekunivertity.secao07;

public class Exercicio03 {

	public static void main(String[] args) {
		//variáveis
		int num;
		
		//processamento
		for(num = 100; num <= 200; num++) {
			if(num % 2 != 0) {
				System.out.println(num + " Impar");
			}
		}
	}
}
