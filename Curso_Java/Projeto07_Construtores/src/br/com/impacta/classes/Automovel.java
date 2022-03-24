package br.com.impacta.classes;

public class Automovel {
	
	
	//FINALIZED 
	
	//STATIC FINAL TEMOS QUE INFORMAR UM VALOR INICIAL 
	 // POR OBRIGACAO.  FINAL TEMOS QUE INFORMAR ALGO.
	
	
	//Quando criamos uma constante (STATIC + FINAL)
	// o nome deve ser maisuculo.
	public static final String PAIS_ORIGEM = "Brasil";
	
	//atributos.
	private	String	marca;  
	private	String modelo;
	private	int ano;
	private	String placa;
	
	//construtores
	public Automovel(String marca, String modelo) {
		this.setMarca(marca);
		this.setModelo(modelo);	
	}
	public Automovel(String marca, String modelo, int ano) {
		this.setMarca(marca);
		this.setModelo(modelo);	
		this.setAno(ano);
	}
	public Automovel(String marca, String modelo, int ano, String placa) {
		this.setMarca(marca);
		this.setModelo(modelo);	
		this.setAno(ano);
		this.setPlaca(placa);
	}
	
	
	
	
	public String mostrar() {	
		
		String titulo = "DADOS DO AUTOM�VEL";
		
		String reposta = titulo +  "\n\nMarca: " + this.getMarca() + 
				         "\nModelo: " + this.getModelo(); 		         
				        
		
		if(this.getAno() > 0) {
			
			reposta += "\nAno: " + this.getAno();
		}
		
		if(this.getPlaca() != null) {
			
			reposta += "\nPlaca: " + this.getPlaca();
		}
		
		reposta +=  "\nPais Origem: " + PAIS_ORIGEM;
		
		
		return reposta;
		
	}
	
   public String mostrar(String titulo) {	
		
		
		String reposta = titulo +  "\n\nMarca: " + this.getMarca() + 
				         "\nModelo: " + this.getModelo() + 
				         "\nAno: " + this.getAno() +
				         "\nPais Origem: " + PAIS_ORIGEM + 
				         "\nPlaca: " + this.getPlaca();		
		
		return reposta;
		
	}
   	
	
	//THIS = REFERENCIA A PROPRIA CLASSE
	 // � uma referencia que serve para termos acesso a todos 
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
			throw new NumberFormatException("O ano n�o pode ser menor que 1970.");
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
