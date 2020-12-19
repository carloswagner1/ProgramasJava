package br.gov.sp.fatec.alog.estruturasequencial;

import java.util.Scanner;

public class exemplo01 {

	public static void main(String[] args) {
		//variáveis
		int Idade, QtdeDias;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.print("Informe a sua idade: ");
		Idade = teclado.nextInt();
		
		//processamento
		QtdeDias = Idade * 365;
		
		//Saída
		System.out.println("A quantidade de dias de vida é: " + QtdeDias);
		
		teclado.close();		

	}

}
