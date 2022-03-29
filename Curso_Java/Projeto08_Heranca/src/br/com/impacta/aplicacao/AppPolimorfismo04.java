package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Aluno;
import br.com.impacta.classes.Curso;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.classes.Pessoa;
import br.com.impacta.enumeracoes.Sexo;

public class AppPolimorfismo04 {
	public static void main(String[] args) {
		
		//copiar do 01
		
		Pessoa p1 = new Funcionario("Joel", 29,Sexo.MASCULINO, "Dev", 3500 );
	    //Desejamos alterar o valor do salario no objeto.
		
		Funcionario func = (Funcionario)p1;
		func.setSalario(40000);
		
		JOptionPane.showMessageDialog(null, p1.mostrar());
		
	     
	    p1 = new Aluno("Lucas",28, Sexo.MASCULINO, 1234,
	    		new Curso(10,"C#", 40,500));
	    
	    //Desejamos alterar o curso para Java;
	    Curso curso  = new Curso(11,"Java",100,1200);
	    
	    if(p1 instanceof Aluno) {	    	
	    	p1.setIdade(27);
	        ((Aluno) p1).setCurso(curso);
	    	
	    }
	    
	    
	    
//		Aluno aluno = (Aluno)p1;
//		aluno.setCurso(curso);    
		    
	    //outra forma de realiza o typecast
	    //((Aluno)p1).setCurso(curso);
	    
	    
	    
	    
	    JOptionPane.showMessageDialog(null, p1.mostrar());
		
	    
		
	}

}
