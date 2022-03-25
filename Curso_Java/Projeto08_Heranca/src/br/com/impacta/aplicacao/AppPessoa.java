package br.com.impacta.aplicacao;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoa {

	public static void main(String[] args) {
		
//		Pessoa pessoa = new Pessoa();
//		pessoa.setNome("Lucas");
//		pessoa.setIdade(28);
//		pessoa.setSexo(Sexo.MASCULINO);
		
		//instancia da  classe funcionario
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Joel");
		funcionario.setIdade(29);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Vendedor");
		funcionario.setSalario(5000);
		
		//instancia da classe Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Luana");
		aluno.setIdade(32);
		aluno.setSexo(Sexo.FEMININO);
		aluno.setMatricula(12345);
		
//		Curso novoCurso = new Curso();
//		novoCurso.setCodigo(222);
//		novoCurso.setDescricao("Java Programmer");
//		novoCurso.setCargaHoraria(100);
//		novoCurso.setPreco(1000);
		
		aluno.setCurso( new Curso(222,"Java Programmer", 100,1000));
		
		
		
		
		
	}
	
}
