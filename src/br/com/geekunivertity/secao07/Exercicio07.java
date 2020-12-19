package br.com.geekunivertity.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		//variáveis
		int Total = 0, Sit01 = 0, Sit02 = 0, Sit03 = 0, Sit04 = 0, Id, Defeito;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o ID: ");
		Id = teclado.nextInt();
		
		while(Id != 0) {
			System.out.println("1-Necessita de esfera.");
			System.out.println("2-Necessita de limpeza.");
			System.out.println("3-Necessita de cabo ou conector.");
			System.out.println("4-Quebrado ou inutilizado.");
			System.out.println("0-Encerrar.");
			System.out.println("Informe o tipo de defeito:");
			Defeito = teclado.nextInt();
			
			//processamento
			if(Defeito == 1) {
				Sit01 = Sit01 + 1;
			}
			if(Defeito == 2) {
				Sit02 = Sit02 + 1;
			}
			if(Defeito == 3) {
				Sit03 = Sit03 + 1;
			}
			if(Defeito == 4) {
				Sit04 = Sit04 + 1;
			}
			Total = Total + 1;
			//entradas
			System.out.println("Informe o Id: ");
			Id = teclado.nextInt();
		}
		float P1, P2, P3, P4; // percentual das situações declaradas
		P1 = ((float)Sit01 / (float)Total * (float)100.0);
		P2 = ((float)Sit02 / (float)Total * (float)100.0);
		P3 = ((float)Sit03 / (float)Total * (float)100.0);
		P4 = ((float)Sit04 / (float)Total * (float)100.0);
		
		System.out.printf("RELATÓRIO FINAL\n\n");
		System.out.printf("Quantidade de mouses %d\n\n", Total);
		System.out.printf("Situação \t\t\t\t\tQuantidade \tPercentual\n");
		System.out.printf("1 - Necessita de esfera \t\t\t\t%d \t%.2f%%\n", Sit01, P1);
		System.out.printf("2 - Necessita de limpeza \t\t\t\t%d \t%.2f%%\n", Sit02, P2);
		System.out.printf("3 - Necessita de troca de cabo ou conector \t\t%d \t%.2f%%\n", Sit03, P3);
		System.out.printf("4 - Quebrado ou inutilizado \t\t\t\t%d \t%.2f%%\n", Sit04, P4);
		
		teclado.close();

	}
	
}
