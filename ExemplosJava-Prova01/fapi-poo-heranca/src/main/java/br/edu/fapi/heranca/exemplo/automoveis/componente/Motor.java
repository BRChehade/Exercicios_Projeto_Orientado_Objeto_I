package br.edu.fapi.heranca.exemplo.automoveis.componente;

public class Motor {

	private int cilindro;
	private int cavalos;
	private double litragem;
	
	public int getCilindro() {
		return cilindro;
	}
	public void setCilindro(int cilindro) {
		this.cilindro = cilindro;
	}
	public int getCavalos() {
		return cavalos;
	}
	public void setCavalos(int cavalos) {
		this.cavalos = cavalos;
	}
	public double getLitragem() {
		return litragem;
	}
	public void setLitragem(double litragem) {
		this.litragem = litragem;
	}
	
	@Override
	public String toString() {
		return "Motor [cilindro=" + cilindro + ", cavalos=" + cavalos + ", litragem=" + litragem + "]";
	}

	
}
