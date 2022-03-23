package br.com.impacta.classes;

public class Automovel {
	
	public static final String paisOrigem = "Brasil";
	
	//atributos.
	private	String	marca;  
	private	String modelo;
	private	int ano;
	private	String placa;
	
	public String mostrar() {	
		
		String titulo = "DADOS DO AUTOMÓVEL";
		
		String reposta = titulo +  "\n\nMarca: " + this.getMarca() + 
				         "\nModelo: " + this.getModelo() + 
				         "\nAno: " + this.getAno() +
				         "\nPais Origem: " + paisOrigem +
				         "\nPlaca: " + this.getPlaca();		
		
		return reposta;
		
	}
	
   public String mostrar(String titulo) {	
		
		
		String reposta = titulo +  "\n\nMarca: " + this.getMarca() + 
				         "\nModelo: " + this.getModelo() + 
				         "\nAno: " + this.getAno() +
				         "\nPais Origem: " + paisOrigem + 
				         "\nPlaca: " + this.getPlaca();		
		
		return reposta;
		
	}
   	
	
	//THIS = REFERENCIA A PROPRIA CLASSE
	 // é uma referencia que serve para termos acesso a todos 
	    // os atributos da classe. (atributos e metodos)
	
	//TODA CLASSE POSSUI UM THIS. (identifica info que fazem parte da classe)
	
	
	
	public void lerDados(String marca, String modelo, int ano, String placa ) {
	
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa);
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
		return this.ano;
	}

	public void setAno(int ano) {
		
		if(ano < 1970) {
			throw new NumberFormatException("O ano não pode ser menor que 1970.");
		}
		
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	
	
	
	
	
	
}
