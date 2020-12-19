package br.gov.sp.fatec.alog.estruturasequencial;

import java.util.Scanner;

public class Algoritmo01 {

	public static void main(String[] args) {
		//variáveis
		float PrecUnit, QtdeVendas, ValPagar;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o valor do preço unitário: ");
		PrecUnit = teclado.nextFloat();
		System.out.println("Informe a quantidade de produtos vendidos: ");
		QtdeVendas = teclado.nextFloat();
		
		//processamento
		ValPagar = QtdeVendas * PrecUnit;
		
		//saída
		System.out.println("O Valor total da venda é R$ " + ValPagar);
		
		teclado.close();		

	}

}
