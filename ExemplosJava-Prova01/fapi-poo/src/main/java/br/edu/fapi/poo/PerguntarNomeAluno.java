package br.edu.fapi.poo;

import java.util.Scanner;

public class PerguntarNomeAluno {

	public static void main(String[] args) {
		Scanner banana = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o seu nome: ");
		aluno.nome = banana.nextLine();
		
		System.out.println("Ow aluno, qualeh seu nome ? >=/");
		String nomeAluno = aluno.falarNome();
		
		System.out.println("Eh, realmente eu desconfiava que seu nome era: " + nomeAluno);
	}
	
}
