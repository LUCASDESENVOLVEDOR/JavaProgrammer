package br.com.impacta.interfaces;

import javax.swing.JOptionPane;

//INTERFACE � ABSTRATO POR DEFINI��O.
public interface Figura extends Comparable<Figura> {    
	
  // todos os metodos de uma interface s�o
	//publicos e abstratos por definicao
  
  //public abstract
  double calcularArea();
  
  //todos os atributos de uma interface 
  //s�o publicos, estaticos e constantes (final)
  //por defini��o
  
  //public static final
   String AUTOR = "Equipe Impacta";
   
   
   //m�todo default = m�todo definido na interface,
   //acessivel por todos os objetos de todas as classes
   //que implementarem
   
   //Disponivel a partir da vers�o 8 do Java
   default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass()
		                           .getSimpleName() +
				"\n�rea: " + this.calcularArea();	
		
		return resposta;	
		
		//this � uma referencia ao objeto da classe que 
		// vai implementar.
		
	}
   
   
  
  
}
