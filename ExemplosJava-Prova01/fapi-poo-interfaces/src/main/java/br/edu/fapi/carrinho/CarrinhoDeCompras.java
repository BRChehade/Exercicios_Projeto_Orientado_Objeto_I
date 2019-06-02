package br.edu.fapi.carrinho;

import br.edu.fapi.produtos.Produto;

public class CarrinhoDeCompras {

	private double valorTotal;
	private int totalDeItens;
	
	//public void adiciona(HQ hq){
	//	this.total += hq.getPreco();
	//}

	//public void adiciona(Revista revista){
	//	this.total += revista.getPreco();
	//}	
	
	//Teríamos um metodo adiciona para cada novo produto ?
	//Isso não parece ser viável, que tal:
	
	public void adiciona(Produto produto){
		this.valorTotal += produto.getPreco();
		this.totalDeItens+=1;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public int getTotalDeItens() {
		return totalDeItens;
	}
	

}


