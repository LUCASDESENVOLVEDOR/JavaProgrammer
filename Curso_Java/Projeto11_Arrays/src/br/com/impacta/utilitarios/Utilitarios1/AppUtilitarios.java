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
		
		
		//executando o metodo calcularMediaArray()
		double[] lista = {2.3, 4.5, 9.1, 10,8};
        double media = Utilitarios.calcularMediaArray(lista);
		
        System.out.println("Média dos elementos do array: " + media);
		

		
	}
}
