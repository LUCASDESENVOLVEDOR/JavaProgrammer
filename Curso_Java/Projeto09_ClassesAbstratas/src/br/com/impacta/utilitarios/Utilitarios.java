package br.com.impacta.utilitarios;

public class Utilitarios {
	
	String curso = "Java";
	
	
	//STATIC dispensa o uso de objeto, e nao 
	  //ocupa espaco na memoria HEAP.
	
	//STATIC não precisa de nenhum objeto para ser
	 // executado.
	
	//pelo fato de ser static o this nao funciona.
	
	public static double somar(double x, double y) {
		return x + y;
	}
	
	//escrever um metodo que receba como parametro um texto
   // e retorne este texto sem espacos.
	public static String removerEspacos(String texto) {
		     
		//System.out.println(curso);
		
		//SUBSTITUIR
		
		//trocar           //antigo //novo
		return texto.replace(" ", "");		
	}
	
	//escrever um metodo que receba como parametro um nome e um 
	//sobrenome e retorne email no formato:nome.sobrenome@impacta.com.br
	public static String gerarEmail(String nome,String sobrenome) {		
		String email = nome.toLowerCase() + "." + sobrenome.toLowerCase() + "@impacta.com.br";		
		return removerEspacos(email);	
		
	}
	
	
	
	
	
	
	
	

}
