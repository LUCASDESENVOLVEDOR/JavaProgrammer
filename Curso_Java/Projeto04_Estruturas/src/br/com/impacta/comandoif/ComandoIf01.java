package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIf01 {
	public static void main(String[] args) {
		
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Qual a sua idade"));
		
		//if = condicao SE
		if(idade < 18) {//se a condição for verdadeira
			System.out.println("Menor de idade");
			
		  }
		else  // senao.
			System.out.println("Maior de idade");
	      
		System.out.println("Idade fornecida: " + idade);
		
	
	
		    
		
		
		
	}

}
