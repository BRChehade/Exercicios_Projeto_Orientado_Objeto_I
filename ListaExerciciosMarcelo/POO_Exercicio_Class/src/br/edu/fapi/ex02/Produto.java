package br.edu.fapi.ex02;

import java.util.Scanner;

public class Produto {
	
	Scanner ler = new Scanner(System.in);
	
	String nome; 
	double preco;
	String marca;
	String cor;
	String fornecedor;
	int quantidade;
	
	void EntradaDados() {
		
		
		
		System.out.println("Informe o Nome do Produto: ");
		nome = ler.next();
		
		System.out.println("Informe o Preço do Produto: ");
		preco = ler.nextDouble();
		
		System.out.println("Informe a Marca do Produto: ");
		marca = ler.next();
		
		System.out.println("Informe a Cor do Produto: ");
		cor = ler.next();
		
		System.out.println("Informe o Fornecedor do Produto: ");
		fornecedor = ler.next();
		
		System.out.println("Informe a Quantidade do Produto: ");
		quantidade = ler.nextInt();
		
		
	}
	

	void SaidaDados (){
		System.out.println("O nome do produto é: " + nome);
		System.out.println("O preço do produto é: " + preco);
		System.out.println("A marca do produto é: " + marca);
		System.out.println("A cor do produto é: " + cor);
		System.out.println("O fornecedor do produto é: " + fornecedor);
		System.out.println("A quantidade do produto é: " + quantidade);
	}
	
}

