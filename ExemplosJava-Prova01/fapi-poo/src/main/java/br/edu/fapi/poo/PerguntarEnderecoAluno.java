package br.edu.fapi.poo;

import java.util.Scanner;

public class PerguntarEnderecoAluno {

	public static void main(String[] args) {
		Scanner banana = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o seu nome: ");
		aluno.nome = banana.nextLine();
		
		Endereco endereco = new Endereco();
		
		aluno.endereco = new Endereco();
		aluno.endereco.bairro = "Bairro Alto";
		System.out.println(aluno.endereco.bairro);

	}

}
