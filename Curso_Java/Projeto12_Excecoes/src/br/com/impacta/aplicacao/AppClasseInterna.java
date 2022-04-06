package br.com.impacta.aplicacao;

import br.com.impacta.classes.Pessoa;
import br.com.impacta.interfaces.Figura;

public class AppClasseInterna {

	public static void main(String[] args) {
		//uso de classe interna anônima - COMPLEMENTO
		
		Figura figura = new Figura() {

			@Override
			public int compareTo(Figura arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double calcularArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		Pessoa p = new Pessoa() {
			
			
			
		};	

	}

}
