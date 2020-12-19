package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		float MedMetros, MedCentimetros;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe a medida em metros: ");
		MedMetros = teclado.nextFloat();
		
		//processamento
		MedCentimetros = MedMetros * 100;
		
		//Saída
		System.out.println(MedMetros + " metros representa " + MedCentimetros + " centímetros");
		
		teclado.close();	

	}

}
