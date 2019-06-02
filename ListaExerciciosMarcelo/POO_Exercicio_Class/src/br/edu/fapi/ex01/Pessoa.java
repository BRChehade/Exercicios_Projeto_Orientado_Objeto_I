package br.edu.fapi.ex01;

import java.util.Scanner;


public class Pessoa {
	
	int rg;
	int cpf;
	String nome;
	
	void Entrada() {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = ler.next();
		System.out.println("Informe seu RG: ");
		rg = ler.nextInt();
		System.out.println("Informe seu CPF: ");
		cpf = ler.nextInt();
	}

 void Printar() {
	// TODO Auto-generated method stub

	 System.out.println("O nome é: " + nome);
		System.out.println("O RG é: " + rg);
		System.out.println("O CPF é; " + cpf);
}
	

}
