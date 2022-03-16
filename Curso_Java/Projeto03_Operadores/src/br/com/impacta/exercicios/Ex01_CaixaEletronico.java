package br.com.impacta.exercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Um caixa eletronico possuia a cédulas:
 * 50,00
 * 20,00
 * 10,00
 * 5,00
 * 
 * Escrever o programa para solicitar ao usuario o 
 * valor do saque. Com base no valor, vamos apresentar
 * a quantidade de cedula dispensada, considerando
 * que as cédulas de maior valor são liberadas 
 * primeiro. * 
 * 
 * Scanner valorSaque = new Scanner(System.in);
		
		double valor = valorSaque.nextDouble();
 * 
 * 
 * */

public class Ex01_CaixaEletronico {
	public static void main(String[] args) {
		
		//solicitar o valor do saque.		
		double valor = Double.parseDouble(
				JOptionPane.showInputDialog("Qual o valor do saque?")
				);
		
		//obter o valor como sendo inteiro.
		 int valorSaque = (int)valor;	//typecast
		 
		 //toda variavel devemos atribuir um valor.
		 int qtde50, qtde20, qtde10,qtde5;
		 qtde50 = qtde20 = qtde10 = qtde5 = 0;
		 
		 //qtde50 = 0;
		 //qtde20 = 0;		 
		 
		 qtde50 = valorSaque / 50; //2 notas de 50;
		 
		 //valorSaque = valorSaque % 50;		 
		 valorSaque %= 50; //receber o resto e atribur no valorSaque
		 
		 qtde20 = valorSaque /20; // 1 nota de 20;
		 
		 valorSaque %= 20;
		 
		 qtde10 = valorSaque / 10; // 0 nota de 10;
		 
		 valorSaque %= 10;
		 
		 qtde5 = valorSaque / 5;
		 
		 
		 String resposta = "Valor do Saque:" + valor  + 
				 "\nNotas de 50: " + qtde50 +
				 "\nNotas de 20: " + qtde20 +
				 "\nNotas de 10: " + qtde10 +
				 "\nNotas de 5: " + qtde5;
		 
		 JOptionPane.showMessageDialog(null, resposta);	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
				
		
		
		System.out.println(valor);
		
		
		
		
		
	}

}
