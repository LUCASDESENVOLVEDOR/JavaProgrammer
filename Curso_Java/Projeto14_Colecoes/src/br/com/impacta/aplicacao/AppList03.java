package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.impacta.classes.Produto;

public class AppList03 {
	public static void main(String[] args) {
		
		        //interface              //tipo
				List<Produto> produtos = new ArrayList<>();		
				produtos.add(new Produto("Informática", "Lapop", 4000));
				produtos.add(new Produto("Limpeza", "Sabonete", 3));
				produtos.add(new Produto("Alimentação", "Macarrão", 5));
				produtos.add(new Produto("Informática", "WebCam", 389));
				produtos.add(new Produto("Transporte", "Bicicleta", 2000));
				
				//apresentando os dados, usando o metodo forEach()
				System.out.println("Lista Orinal: ");
				produtos.forEach(produto -> System.out.println(produto));
						
				//ordenacao pela categoria
				produtos.sort((a,b) -> a.getCategoria().compareTo(b.getCategoria()));
				
				System.out.println();
				System.out.println("Lista Ordenada pela Categoria:");
				produtos.forEach(produto -> System.out.println(produto));			
		
		
		
		
	}

}
