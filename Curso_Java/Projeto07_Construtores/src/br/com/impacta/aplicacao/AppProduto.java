package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		
		
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"));
		String cat = JOptionPane.showInputDialog("Informe a categoria");
		String desc = JOptionPane.showInputDialog("Informe a descrição");
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço"));
		
		celular.setCodigo(cod);
	    celular.setCategoria(cat);
	    celular.setDescricao(desc);
	    celular.setPreco(preco);
	    
	    System.out.println(celular.mostrar());
	    JOptionPane.showMessageDialog(null,celular.mostrar());
		
		
		
	}

}
