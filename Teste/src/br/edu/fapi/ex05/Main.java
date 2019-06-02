package br.edu.fapi.ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServicoDeDesconto service;
		
		

		String produto;
		double preco;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um Produto");
		produto = ler.nextLine();
		System.out.println("Informe um Preço");
		preco = ler.nextDouble();
		
		if(produto.startsWith("A") || produto.startsWith("a") ) {
			//System.out.println("Olá, Produto: " + produto + " com valor: " + preco);
			service = new Desc1();
			System.out.println(produto + " ficaria " + preco + " com o desconto dado o valor final é:  " + service.calcularDesconto(preco));
		}
		
		

	}
}

