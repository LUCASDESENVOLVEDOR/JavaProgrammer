package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

public class AppExcecoes04 {
	public static void main(String[] args) {

		try {

			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			JOptionPane.showMessageDialog(null, "Nome informado: " + nome.toUpperCase());

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
			JOptionPane.showMessageDialog(null, "Idade informada: " + idade);

		} 				
			
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro Geral: " +  e.getMessage());

			
		}
		
		

	}
}
