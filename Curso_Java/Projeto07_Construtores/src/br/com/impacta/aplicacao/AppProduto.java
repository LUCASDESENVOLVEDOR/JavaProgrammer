package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo"));
		String cat = JOptionPane.showInputDialog("Informe a categoria");
		String desc = JOptionPane.showInputDialog("Informe a descri��o");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o"));
		
		celular.setCodigo(cod);
	    celular.setCategoria(cat);
	    celular.setDescricao(desc);
	    celular.setPreco(preco);
	    
	    System.out.println(celular.mostrar());
	    JOptionPane.showMessageDialog(null,celular.mostrar());
		
		
		
	}

}
