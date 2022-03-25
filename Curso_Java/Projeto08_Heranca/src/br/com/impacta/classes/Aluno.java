package br.com.impacta.classes;

import br.com.impacta.enumeracoes.Sexo;

public class Aluno extends Pessoa {
  
	private int matricula;
	private Curso curso;
	
	 
	public Aluno() {	
		super();
	}
	
	public Aluno(String nome, int idade,Sexo sexo,int matricula,Curso curso) {
      super(nome, idade,sexo);
      this.setMatricula(matricula);
      this.setCurso(curso);
	}
	
	
	
	public int getMatricula() {
		 
		 
		
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
