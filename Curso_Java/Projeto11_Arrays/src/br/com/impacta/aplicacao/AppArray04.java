package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppArray04 {

	public static void main(String[] args) {
		
		//o usuario fornece alguns nome de pessoa para uma lista.		
		String[] pessoas = new String[4];		
		
		for (int i = 0; i < pessoas.length; i++) {
			
			
		  pessoas[i] = 	JOptionPane.
				  showInputDialog("Informe o nome " + (i+1));
		  
		  
		}
		
		
		for (int i = 0; i < pessoas.length; i++) {
			
			JOptionPane.showMessageDialog(null,
					  "\nIndice do array : "  + i + 
					  "\nValor do Indice: " + pessoas[i]
					  );		
			
		}
		
		
		
		for( String nome_posicao_array : pessoas) {			
			
			System.out.println(nome_posicao_array);			
		}
		
		
		
		
		

	}

}
