package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercico10 {

	public static void main(String[] args) {
		//variáveis
		int idade;
		try (Scanner teclado = new Scanner(System.in)) {
			//Entradas
			System.out.println("informe a idade do nadador: " );
			idade = teclado.nextInt();
		}
		
		//Processamento
		if(idade >= 5 && idade <=7){
			System.out.println("Infantil A");
		}
		if(idade >= 8 && idade <= 11){
			System.out.println("Infantil B");
		}
		if(idade >= 12 && idade <= 13){
			System.out.println("Juvenil A");
		}
		if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}
		if(idade >=18){
			System.out.println("Adulto");
		}
				
	}

}
