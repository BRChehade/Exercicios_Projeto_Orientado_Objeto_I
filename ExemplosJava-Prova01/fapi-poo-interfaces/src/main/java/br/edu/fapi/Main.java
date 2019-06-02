package br.edu.fapi;

import java.util.Scanner;

import br.edu.fapi.carrinho.CarrinhoDeCompras;
import br.edu.fapi.carrinho.registro.ServicoRegistroItens;
import br.edu.fapi.excecao.DescontoInvalidoException;
import br.edu.fapi.produtos.hq.HQDigital;
import br.edu.fapi.produtos.hq.HQFisica;
import br.edu.fapi.produtos.hq.HQPocket;
import br.edu.fapi.produtos.revista.Revista;

public class Main {

	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		HQFisica hqFisica = new HQFisica("Os Novos Vingadores - Guerra Civil 1", "Brian Michael Bendis", "Panini", 288, "Portugues", "8573518502", 50.00);
		hqFisica.setCapa("Capa Dura");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite qual o desconto que o cliente deseja receber por levar a edição capa dura:");
		try {
			hqFisica.aplicarDesconto(scanner.nextDouble());
		} catch (DescontoInvalidoException e) {
			System.out.println(e.getMessage() + " O desconto desejado era de " + e.getDesconto());
		}finally {
			if(scanner != null){
				scanner.close();
			}
		}

		System.out.println();
		System.out.println("O preço da edição capa dura é: " + hqFisica.getPreco());
		System.out.println("Adicionando ao carrinho.");
		carrinhoDeCompras.adiciona(hqFisica);
		System.out.println("Valor Total: " + carrinhoDeCompras.getValorTotal());
		System.out.println("Total de itens: " + carrinhoDeCompras.getTotalDeItens());
		System.out.println();
		
		HQDigital hqDigital = new HQDigital("Os Novos Vingadores - Guerra Civil 1", "Brian Michael Bendis", "Panini", 288, "Portugues", "8573518502", 50.00);
		hqDigital.setConfiguracaoDeFonte(true);
		hqDigital.setDicasDeVocabulario(false);
		hqDigital.setTamanho(480);

		hqDigital.aplicarDescontoDe50Porcento();
		System.out.println("O preço da edição digital é: " + hqDigital.getPreco());
		
		carrinhoDeCompras.adiciona(hqDigital);
		System.out.println("Total: " + carrinhoDeCompras.getValorTotal());
		System.out.println("Total de itens: " + carrinhoDeCompras.getTotalDeItens());
		System.out.println();
		

		HQPocket hqPocket = new HQPocket("Os Novos Vingadores - Guerra Civil 1", "Brian Michael Bendis", "Panini", 288, "Portugues", "8573518502", 50.00);
		hqPocket.setCapa("Brochura");

		hqPocket.aplicarDescontoDe20Porcento();
		System.out.println("O preço da edição pocket é: " + hqPocket.getPreco());
		carrinhoDeCompras.adiciona(hqPocket);
		System.out.println("Total: " + carrinhoDeCompras.getValorTotal());
		System.out.println("Total de itens: " + carrinhoDeCompras.getTotalDeItens());
		System.out.println();
		
		
		Revista revista = new Revista("Mundo Marvel", "Panini", 10.00);
		System.out.println("O preço da revista é: " + revista.getPreco());
		carrinhoDeCompras.adiciona(revista);
		System.out.println("Total: " + carrinhoDeCompras.getValorTotal());
		System.out.println("Total de itens: " + carrinhoDeCompras.getTotalDeItens());
		System.out.println();
		System.out.println();
		
		System.out.println("Seu carrinho de compras possuí " + carrinhoDeCompras.getTotalDeItens() + " totalizando R$"
				+ carrinhoDeCompras.getValorTotal());
		
		System.out.println("Salvando resumo.");
		ServicoRegistroItens servicoRegistroItens = new ServicoRegistroItens();
		servicoRegistroItens.salvarResumoCarrinho(carrinhoDeCompras);

	}

}
