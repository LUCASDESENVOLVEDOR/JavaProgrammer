package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;
import br.com.impacta.interfaces.Documento;



public abstract class Pessoa {
	
	private	String nome;
	private	int idade;
	private	Sexo sexo;
	
	private Documento documento;
	
	public Pessoa() {
		super();
	}
	
	
	public Pessoa(String nome, int idade, Sexo sexo, Documento documento) {
		super();
		this.setNome(nome);	
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setDocumento(documento);
		
	}
	
	public String mostrar() {
		
		return  "\nNome: " + this.getNome() + 
				"\nIdade:" + this.getIdade() +
				"\nSexo:" + this.getSexo() +
				
		(this.getDocumento() instanceof DocumentoCpf 
				? "\nCPF: " : "\nCNPJ: " )
		
		+  this.getDocumento().getNumero();
				
				
	}
	
	
	
	
	public Documento getDocumento() {
		return documento;
	}


	public void setDocumento(Documento documento) {
		this.documento = documento;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}	

	
	
	
}
































