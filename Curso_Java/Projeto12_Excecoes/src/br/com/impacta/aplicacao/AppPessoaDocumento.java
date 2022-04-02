package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.DocumentoCnpj;
import br.com.impacta.classes.Funcionario;
import br.com.impacta.enumeracoes.Sexo;

public class AppPessoaDocumento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Lucas A");
		funcionario.setIdade(28);
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Professor");
		funcionario.setSalario(50000);
		//funcionario.setDocumento( new DocumentoCpf("9457471000"));
		
		funcionario.setDocumento( new DocumentoCnpj("94574710001232"));
		
		JOptionPane.showMessageDialog(null,
				funcionario.mostrar());
		
		
	}

}
