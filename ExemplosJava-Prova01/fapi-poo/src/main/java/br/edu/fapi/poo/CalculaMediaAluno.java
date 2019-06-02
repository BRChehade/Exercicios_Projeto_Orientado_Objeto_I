package br.edu.fapi.poo;

import java.util.Scanner;

public class CalculaMediaAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Endereco endereco = new Endereco();
		endereco.setBairro("Bairro");
		endereco.setRua("Rua");
		endereco.setNumero(123);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno:");
		aluno.setNome(scanner.nextLine());
		
		System.out.println("\nDigite a matrícula do aluno:");
		aluno.setMatricula(scanner.next());
		
		System.out.println("Digite a primeira nota do aluno:");
		aluno.setNota1(scanner.nextDouble());
		
		System.out.println("Digite a segunda nota do aluno:");
		aluno.setNota2(scanner.nextDouble());
		
		GerenciadorAcademicoDeAlunos gaa = new GerenciadorAcademicoDeAlunos();
		gaa.calcularMediaAluno(aluno);
		
		System.out.println("A média do aluno é: " + aluno.getMedia());
		aluno.setMedia(10);
		System.out.println("A média do aluno é: " + aluno.getMedia());
	}
}




