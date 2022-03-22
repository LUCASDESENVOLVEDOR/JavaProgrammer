package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {

		// declarando variavel

		// tipo nome
		Automovel auto = new Automovel();
		auto.lerDados("Honda", "Civic", 2019, "EBB1234");
		
		auto.setAno(2015);
		
		
		
		String texto = auto.mostrar();		
		System.out.println(texto);
		JOptionPane.showMessageDialog(null, texto);
		

		
	}
}
