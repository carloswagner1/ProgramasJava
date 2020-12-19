package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		//variáveis
		int Codigo, HorasTrabalhadas, Sobrejornada, HorasNormais;
		float Salario, HorasExtras;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o código do funcionário: ");
		Codigo = teclado.nextInt();
		System.out.println("Informe as horas trabalhadas: ");
		HorasTrabalhadas = teclado.nextInt();
		
		//processamento
		if(HorasTrabalhadas > 50){
			Sobrejornada = HorasTrabalhadas - 50;
			HorasNormais = HorasTrabalhadas - Sobrejornada;
		}else {
			HorasNormais = HorasTrabalhadas;
			Sobrejornada = 0;
		}
		Salario = HorasNormais * (float)10.00;
		HorasExtras = Sobrejornada * (float)20.00;
		
		//Saída
		System.out.printf("Código Funcionário: %d\n", Codigo);
		System.out.printf("Salário R$ %.2f\n", Salario);
		System.out.printf("Horas Extras R$ %.2f\n", HorasExtras);
		
		teclado.close();
	}
}
