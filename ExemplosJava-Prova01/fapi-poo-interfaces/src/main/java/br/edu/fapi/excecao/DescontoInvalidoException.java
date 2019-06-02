package br.edu.fapi.excecao;

@SuppressWarnings("serial")
public class DescontoInvalidoException extends Exception{

	private double desconto;	

	public DescontoInvalidoException(String message, double desconto){
		super(message);
		this.desconto = desconto;
	}
	
	public double getDesconto() {
		return desconto;
	}
}


