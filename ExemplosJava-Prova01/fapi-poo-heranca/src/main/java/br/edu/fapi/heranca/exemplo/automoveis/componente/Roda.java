package br.edu.fapi.heranca.exemplo.automoveis.componente;

public class Roda {
	
	private String marca;
	private int aro;
	private int pressao;
	private String posicao;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAro() {
		return aro;
	}
	public void setAro(int aro) {
		this.aro = aro;
	}
	public int getPressao() {
		return pressao;
	}
	public void setPressao(int pressao) {
		this.pressao = pressao;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	@Override
	public String toString() {
		return "Roda [marca=" + marca + ", aro=" + aro + ", pressao=" + pressao + ", posicao=" + posicao + "]";
	}
	
}
