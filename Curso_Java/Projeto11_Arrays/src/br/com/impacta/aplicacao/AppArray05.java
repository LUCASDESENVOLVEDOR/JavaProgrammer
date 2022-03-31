package br.com.impacta.aplicacao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class AppArray05 {
public static void main(String[] args) {
		
		//o usuario fornece alguns nome de pessoa para uma lista.		
		
	    int quantidade = Integer.parseInt(  JOptionPane.
				     showInputDialog
				     ("Informe um quantidade de nomes"));
		
	    if(quantidade <= 0) {
	    	
	    	JOptionPane.showMessageDialog(null, 
	    			"A quantidade dever maior que zero!",
	    			"Erro",
	    			JOptionPane.ERROR_MESSAGE);
	    	
	    	//sair do metodo
	    	return;	  
	    	
	    }
	    
	
	     String[] nomes = new String[quantidade];		
		
		for (int i = 0; i < nomes.length; i++) {		
			
			nomes[i] = 	JOptionPane. showInputDialog("Informe o nome " + (i+1));
		  
		}
		
		//ordenamos os nomes por ordem alfabetica.
		Arrays.sort(nomes);
		
				
		for( String nome_posicao_array : nomes) {	
			System.out.println(nome_posicao_array);			
		}
	
		
		
		

	}

}
