package br.com.impacta.aplicacao;

import br.com.impacta.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		
		Produto celular = new Produto();
		celular.codigo = 100;
		celular.categoria = "telefonia";
		celular.descricao = "Iphone";
		celular.preco = 25000;
		
		
	}

}
