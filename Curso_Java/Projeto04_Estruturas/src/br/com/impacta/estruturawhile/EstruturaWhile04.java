package br.com.impacta.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile04 {
public static void main(String[] args) {
		
		/*
		 * Nesse programa, o usuário fornece uma certa
		 * quantidade de números. A entrada de dados 
		 * termina quando o úsuario digitar o número 0.
		 * 
		 * Cada número informado é mostrado na tela
		 * 
		 * Se o usuário digitar um número negativo, este é
		 * ignorado
		 * 
		 * 
		 * No final, o programa deve mostrar a soma 
		 * e a quantidade de números informados.
		 * */
		
		int quantidade = 0;
		int soma = 0;
		
		while(true) {
			
			int numero = Integer.parseInt(JOptionPane			.showInputDialog("Informe um número"));
			
			if(numero == 0) {
				break; // interrompe a estrutura de repetição.				
			}
			
			if(numero < 0) {
			   continue; //continuar para a prox instrução.
			        //(volta para o inicio)
			}
			
			System.out.println(numero);
			
			
			soma += numero;
			quantidade++;		
		}	
		
		System.out.println("Soma dos números informados:" + soma);
		System.out.println("Quantidade de números informados: " + quantidade);
		
		
		//Return sai do método.
		//Break interrompe a estrutura de repetição
		//Continue, volta o a repetição do inicio
		
		
		
	}

}
