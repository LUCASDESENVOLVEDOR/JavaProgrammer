package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo01 {
	public static void main(String[] args) {
		
		Pessoa p1 = new Funcionario("Joel", 29,Sexo.MASCULINO, "Dev", 3500 );
	    JOptionPane.showMessageDialog(null, p1.mostrar());
		
	    //QUEM EXECUTA O METODO É O OBJETO! Nunca a variavel.	    
	    //p1 é apenas uma variavel de referencia.
	    
	    p1 = new Aluno("Lucas",28, Sexo.MASCULINO, 1234,
	    		new Curso(10,"C#", 40,500));
	    
	    JOptionPane.showMessageDialog(null, p1.mostrar());
		
	    
		
		
	}

}
