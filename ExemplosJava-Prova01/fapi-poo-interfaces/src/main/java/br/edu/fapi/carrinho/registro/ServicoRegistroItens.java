package br.edu.fapi.carrinho.registro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import br.edu.fapi.carrinho.CarrinhoDeCompras;

public class ServicoRegistroItens {

	public void salvarResumoCarrinho(CarrinhoDeCompras carrinhoDeCompras) {
		try(PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Temp\\carrinho.txt",true))) {;
			
			printWriter.println("Quantidade itens: " + carrinhoDeCompras.getTotalDeItens());
			printWriter.println("Valor Total: R$" + carrinhoDeCompras.getValorTotal());
			printWriter.println("---------------------------");
			
			System.out.println("Itens salvos com sucesso.");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
