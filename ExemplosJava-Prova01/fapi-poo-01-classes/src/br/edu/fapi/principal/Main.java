package br.edu.fapi.principal;

import java.util.Scanner;

import br.edu.fapi.aluno.Aluno;
import br.edu.fapi.aluno.calculo.CalculadoraMedia;

public class Main {
	
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		
		Aluno thiago = new Aluno();
		Aluno savio = new Aluno();
		//System.out.println("Por gentileza, digite seu nome :)");
		//leiteCondensado1.nome = entradaDeDados.nextLine();
		
		thiago.nota1 = 4;
		thiago.nota2 = 10;
		
		CalculadoraMedia calculadoraDeMedia = new CalculadoraMedia();
		
		System.out.println(calculadoraDeMedia.calcularMedia(thiago));
	}

	

}
