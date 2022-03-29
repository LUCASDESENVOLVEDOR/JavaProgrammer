package br.com.impacta.aplicacao;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Produto;
import br.com.impacta.classes.ProdutoImportado;

public class AppPolimorfismo03 {
	public static void main(String[] args) {
		
		Produto prod = new Produto("Alimentação", "Batata Frita", 50);
		Produto prod2 = new 
				ProdutoImportado("Transporte", "Bicicleta",2500,6.0);
		
		//desejamos alterar a taxa de importação para 7.0%
		if(prod2 instanceof ProdutoImportado) {
			((ProdutoImportado) prod2).setTaxaImportacao(7.0);
		}
		
		
		
		JOptionPane.showMessageDialog(null, prod.mostrar());
		JOptionPane.showMessageDialog(null, prod2.mostrar());
		
		
		
		
	}
	

}
