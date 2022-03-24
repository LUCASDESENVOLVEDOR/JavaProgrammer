package br.com.impacta.utilitarios.Utilitarios1;

import javax.swing.JOptionPane;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		double soma = Utilitarios.somar(12, 15.6);
		System.out.println(soma);	
	
		
		String novaFrase = Utilitarios
				.removerEspacos("Está chovendo muito");
		
		System.out.println(novaFrase);
		
		
		System.out.println(Utilitarios
				.gerarEmail(" Lucas ", " Aragao "));
		

		
	}
}
