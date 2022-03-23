package br.com.impacta.aplicacao;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Automovel;

public class AppAutomovel01 {
	public static void main(String[] args) {

		// declarando variavel

		// tipo nome
		Automovel auto = new Automovel();
		auto.lerDados("Honda", "Civic", 2020, "EBB1234");
		
		//auto.setAno(1959);
		
		//Automovel.paisOrigem = "Argentina";
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		//Automovel.paisOrigem = "Colombia";
		JOptionPane.showMessageDialog(null, auto.mostrar());
		
		
		//double resultado = somar(4, 2);
		String texto2 = auto.mostrar();
		//System.out.println(texto);
		System.out.println(texto2);
		//JOptionPane.showMessageDialog(null, texto);
		//JOptionPane.showMessageDialog(null, texto,"Relatório", JOptionPane.ERROR_MESSAGE);
		
		//int n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));

		

		
		
		
		
		
		
		
		
	}
}
