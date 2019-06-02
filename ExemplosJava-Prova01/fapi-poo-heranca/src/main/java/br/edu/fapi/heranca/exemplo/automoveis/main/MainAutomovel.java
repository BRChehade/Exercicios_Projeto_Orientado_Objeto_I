package br.edu.fapi.heranca.exemplo.automoveis.main;

import br.edu.fapi.heranca.exemplo.automoveis.Carro;
import br.edu.fapi.heranca.exemplo.automoveis.componente.Motor;
import br.edu.fapi.heranca.exemplo.automoveis.componente.Roda;

public class MainAutomovel {

	public static void main(String[] args) {
		Carro automovel = new Carro();
		automovel.setCor("Vermelho");
		
		Motor motorMercedesCLS = new Motor();
		motorMercedesCLS.setCavalos(480);
		motorMercedesCLS.setCilindro(6);
		motorMercedesCLS.setLitragem(5.0);
		
		automovel.setMotor(motorMercedesCLS);
		
		automovel.getRodas().add(new Roda());
		automovel.getRodas().add(new Roda());
		automovel.getRodas().add(new Roda());
		automovel.getRodas().add(new Roda());
		
		automovel.setCategoria("Sedan");
		
		System.out.println(automovel.toString());
	}

}
