package br.edu.fapi.heranca.exemplo.automoveis;

import java.util.ArrayList;
import java.util.List;

import br.edu.fapi.heranca.exemplo.automoveis.componente.Motor;
import br.edu.fapi.heranca.exemplo.automoveis.componente.Roda;

public class Automovel {

	protected Motor motor;
	private List<Roda> rodas = new ArrayList<Roda>();
	// private Roda[] rodas;
	private String cor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public List<Roda> getRodas() {
		return rodas;
	}

	public void setRodas(List<Roda> rodas) {
		this.rodas = rodas;
		rodas = null;
	}
	
	public void setRodas(Roda roda) {
		if(rodas == null) {
			rodas = new ArrayList<Roda>();
		}else {
			rodas.add(roda);
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Automovel [motor=" + motor + ", rodas=" + rodas + ", cor=" + cor + "]";
	}

}
