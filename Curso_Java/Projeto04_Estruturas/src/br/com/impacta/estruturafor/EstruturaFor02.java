package br.com.impacta.estruturafor;

import javax.swing.JOptionPane;

public class EstruturaFor02 {
	public static void main(String[] args) {
		
		int quantidade = Integer.parseInt( 
				JOptionPane.showInputDialog("Quantas pessoas estão na sala?"));
		
		//variavel para receber a maior idade.
		int maior = 0;
		int posicao = 0;
		
		
		for (int i = 1; i <= quantidade; i++) {
			
			//perguta sera repetida enquanto o for 
			 //estiver sendo repetido
			String pergunta = "Pessoa " + i + 
					"\n Qual a idade da pessoa " + i + "?";
			
			//idade vai receber um novo valor 
			//para cada pessoa.
			int idade = Integer.parseInt
					(JOptionPane.showInputDialog(pergunta));
			
			//System.out.println("a idade atual: " + idade);	
			
			//caso a idade atual for maior 
			 // que a variavel de fora
			if(idade > maior) {	
				
				maior = idade;	//atualizamos a variavel de fora			
				posicao = i; //posicao atual.
			}			
		}
		
		String resposta = "Maior idade: " + maior + 
				"\n Pessoa: " + posicao;
		
		JOptionPane.showMessageDialog(null, resposta);
		
		
		
	}
}
