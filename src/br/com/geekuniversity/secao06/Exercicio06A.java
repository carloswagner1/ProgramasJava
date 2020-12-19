package br.com.geekuniversity.secao06;

import java.util.Scanner;

public class Exercicio06A {

	public static void main(String[] args) {
		int Codigo;
		float HorasTrabalhadas, Salario, HorasExtras = 0;
		Scanner teclado = new Scanner(System.in);
				
		//entradas
		System.out.println("Informe o código do funcionário: ");
		Codigo = teclado.nextInt();
		System.out.println("Informe as horas trabalhadas: ");
		HorasTrabalhadas = teclado.nextInt();
				
		//processamento
		if(HorasTrabalhadas > 50){
			HorasExtras = (float)(HorasTrabalhadas - 50) * (float)(20.00);
			Salario = (float)(50 * 10.00) + HorasExtras;
			System.out.printf("Código Funcionário: %d\n", Codigo);
			System.out.printf("Salário Total R$ %.2f\n", Salario);
			System.out.printf("(Horas Extras R$ R$ %.2f)\n", HorasExtras);
		}else {
			Salario = HorasTrabalhadas * (float)10.00;
			System.out.printf("Código Funcionário: %d\n", Codigo);
			System.out.printf("Salário Total R$ %.2f\n", Salario);
		}
		teclado.close();
	}
}