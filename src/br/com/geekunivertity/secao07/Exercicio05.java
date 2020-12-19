package br.com.geekunivertity.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//variáveis
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		//entrada
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		System.out.println("Informe a Senha: ");
		senha = teclado.next();
		
		//processamento
		while(nome.equals(senha)) {
			System.out.println("Erro: O nome de usuário e a senha devem ser diferentes. ");
			System.out.println("Informe o nome: ");
			nome = teclado.next();
			System.out.println("Informe a Senha: ");
			senha = teclado.next();
		}
		System.out.println("Dados inseridos com sucesso. ");
		teclado.close();		
	}

}
