package br.com.impacta.comandoif;

import javax.swing.JOptionPane;

public class ComandoIF02 {
	public static void main(String[] args) {
		/*
		 * Um funcion�rio ter� um valor de 10% de descondo,
		 * SE o sal�rio bruto for superior de 5000 reais.
		 * O desconto ser� calculado sobre a diferenca 
		 * entre o valor do sal�rio e o valor base de 5000.
		 * */
		
		 double salario = Double.parseDouble
				 (JOptionPane.showInputDialog("Informe o sal�rio"));
		
		 double desconto = 0;
		 
		 if(salario > 5000) {
			 desconto = (salario - 5000) * 10 / 100;
		 }
		 
		 String resposta = "S�lario Bruto: " + salario +
				 "\nDesconto: " + desconto +
				 "\nSal�rio L�quido: " + (salario - desconto);
		
		
		 JOptionPane.showMessageDialog(null,resposta);
		
		
	}

}
