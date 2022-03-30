package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Figura;
import br.com.impacta.classes.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {
		
		Retangulo ret = new Retangulo();
		ret.setBase(10);
		ret.setAltura(15);
				
		Circulo cir = new Circulo();
		cir.setRaio(5);
		
		apresentarFigura(ret);
		apresentarFigura(cir);
		
		
		
		
		
	}
	
	private static void apresentarFigura(Figura figura) {
		
		String resposta = "Classe: " + figura.getClass()
		                           .getSimpleName() +
				"\n¡rea: " + figura.calcularArea();
		
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
	}
	

}
