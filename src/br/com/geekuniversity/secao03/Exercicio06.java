package br.com.geekuniversity.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//variáveis
		float SalHora, SalMensal;
		int HorasTrabalhadas;
		Scanner teclado = new Scanner(System.in);
		
		//Entradas
		System.out.println("Informe o valor do Salário Hora: ");
		SalHora = teclado.nextFloat();
		System.out.println("Informe a quantidade de horas trabalhadas");
		HorasTrabalhadas = teclado.nextInt();
		
		//processamento
		SalMensal = SalHora * HorasTrabalhadas;
		
		//Saída
		System.out.println("O Salário Mensal é R$ " + SalMensal);
		
		teclado.close();		

	}

}
