package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		//variáveis
		float IndicePoluicao;
		Scanner teclado = new Scanner(System.in); 
		
		//entradas
		System.out.println("Informe o índice de poluição: ");
		IndicePoluicao = teclado.nextFloat();
		
		//processamento
		if(IndicePoluicao >= 0.3 && IndicePoluicao < 0.4){
			System.out.println("Grupo 1 - Suspender as atividades.");
		}
		if(IndicePoluicao >= 0.4 && IndicePoluicao < 0.5){
			System.out.println("Grupo 1 e 2 - Suspender as atividades.");
		}
		if(IndicePoluicao >= 0.5){
			System.out.println("Todos os grupos - Suspender as Atividades.");
		}
		teclado.close();
	}
}
