package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile03 {
	
	public static void main(String[] args) {
		
		/*
		 * Nesse programa, o usu?rio fornece uma certa
		 * quantidade de n?meros. A entrada de dados 
		 * termina quando o ?suario digitar o n?mero 0.
		 * 
		 * No final, o programa deve mostrar a soma 
		 * e a quantidade de n?meros informados.
		 * */
		
		int quantidade = 0;
		int soma = 0;
		
		while(true) {
			
			int numero = Integer.parseInt(JOptionPane
					.showInputDialog("Informe um n?mero"));
			
			if(numero == 0) {
				break; // interrompe a estrutura de repeti??o.				
			}
			
			soma += numero;
			quantidade++;
			
			
		}	
		
		System.out.println("Soma dos n?meros informados:" + soma);
		System.out.println("Quantidade de n?meros informados: " + quantidade);
		
		
	}
	

}
