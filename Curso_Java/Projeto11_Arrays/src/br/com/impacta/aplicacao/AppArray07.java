package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Circulo;
import br.com.impacta.classes.Retangulo;
import br.com.impacta.interfaces.Figura;

public class AppArray07 {
	public static void main(String[] args) {
		
		// definindo um array de "Figuras"
		Figura[] figuras = new Figura[3];
		
		figuras[0] = new Retangulo(12,14);
		figuras[1] = new Circulo(20);
		figuras[2] = new Retangulo(1,1);
		
		//apresentando as figuras
		for (Figura figura : figuras) {
			JOptionPane.showMessageDialog(null,
					figura.apresentarFigura());
		}
		
	}

}
