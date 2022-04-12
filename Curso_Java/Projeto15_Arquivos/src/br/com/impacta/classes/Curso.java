package br.com.impacta.classes;

public class Curso implements Comparable<Curso>  {
	
	private int codigo;
	private String descricao;
	private int cargaHoraria;
	private double preco;
	
	
	public Curso(int codigo, String descricao, int cargaHoraria, double preco) {
		super();
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setCargaHoraria(cargaHoraria);
		this.setPreco(preco);
	}
	
	
	public String mostrar() {
		
		return "Código: " + this.getCodigo() +
				"\nDescrição: " + this.getDescricao() + 
				"\nCarga Horária: " + this.getCargaHoraria()+
				"\nPreço: " + this.getPreco();			
		
		
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}


	@Override
	public int compareTo(Curso curso_atual) {
		
	return this.getDescricao().compareTo(curso_atual.getDescricao());
		
	}


	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Curso) {
			Curso c = (Curso)obj;
			
			if(this.getCodigo() == c.getCodigo() &&
					this.getDescricao() == c.getDescricao() &&
					this.getCargaHoraria() == c.getCargaHoraria() &&
					this.getPreco() == c.getPreco()) {
				
				return true;
			}				
		}
		
		return false;
		
		
	}


	@Override
	public int hashCode() {
		//empacotando um tipo primitivo dentro de um objeto.
		
		Double n = this.getPreco(); //autoboxing		
		
		return this.getCodigo() + this.getDescricao().hashCode() +
			this.getCargaHoraria() + n.hashCode();
	}
	
	
	
	
	

}















