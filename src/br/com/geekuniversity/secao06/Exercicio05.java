package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		float Peso, Multa, Excesso;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o peso dos peixes: ");
		Peso = teclado.nextFloat();
		
		//Processamento
		if(Peso > 50){
			Multa = (float)(Peso - 50) * (float)4.00;
			Excesso = (float)(Peso - 50);
			System.out.printf("Você deverá pagar R$ %.2f em multas.\n", Multa);
			System.out.printf("O peso excedente é %.2f", Excesso);
		}else {
			System.out.println("Peso dentro do limite permitido. Não há multa a ser cobrada");
		}
		teclado.close();
	}
}
	
