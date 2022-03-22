package br.com.impacta.classes;

public class Automovel {
	
	//atributos.
	private	String	marca;  
	private	String modelo;
	private	int ano;
	private	String placa;
	
	public String mostrar() {	
		
		String reposta = "Marca: " + marca + 
				         "\nModelo: " + modelo + 
				         "\nAno: " + ano + 
				         "\nPlaca: " + placa;
		
		
		return reposta;
		
	}
	
	//THIS = REFERENCIA A PROPRIA CLASSE
	 // é uma referencia que serve para termos acesso a todos 
	    // os atributos da classe. (atributos e metodos)
	
	//TODA CLASSE POSSUI UM THIS. (identifica info que fazem parte da classe)
	
	public void lerDados(String marca, String modelo, int ano, String placa ) {
		this.marca = marca;
	    this.modelo = modelo;
	    this.ano =  ano;
	    this.placa =  placa;	    
	   
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
	
	
	
	
	
}
