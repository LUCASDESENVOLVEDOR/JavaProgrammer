package br.com.impacta.interfaces;

import javax.swing.JOptionPane;

//INTERFACE É ABSTRATO POR DEFINIÇÃO.
public interface Figura {    
	
  // todos os metodos de uma interface são
	//publicos e abstratos por definicao
  
  //public abstract
  double calcularArea();
  
  //todos os atributos de uma interface 
  //são publicos, estaticos e constantes (final)
  //por definição
  
  //public static final
   String AUTOR = "Equipe Impacta";
   
   
   //método default = método definido na interface,
   //acessivel por todos os objetos de todas as classes
   //que implementarem
   
   //Disponivel a partir da versão 8 do Java
   default String apresentarFigura() {
		
		String resposta = "Classe: " + this.getClass()
		                           .getSimpleName() +
				"\nÁrea: " + this.calcularArea();	
		
		return resposta;	
		
		//this é uma referencia ao objeto da classe que 
		// vai implementar.
		
	}
   
   
  
  
}
