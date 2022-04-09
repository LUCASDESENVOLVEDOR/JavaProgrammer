package br.com.impacta.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppList01 {

	public static void main(String[] args) {
		
		
		List<String> nomes = new  ArrayList<>();
		
		nomes.add("Maria");	
		//nomes.add("Lucas");	
		nomes.add("Alex");	
		
		nomes.add(0,"Lucas");	
		
		//cuidado
		//nomes.remove(1);
		
		//analise de todos os nomes da lista, para remover todos os
		//que terminam com s.
		  
		//nomes.removeIf( parametro_do_metodo -> parametro_do_metodo.endsWith("s"));		
		
		
		//apresentando os elementos usando a propria lista.
		System.out.println(nomes);
		
		System.out.println();
		
        //usando a estrura foreach		
		for (String nome : nomes) {			
			System.out.println(nome);
		}
		
		
		//Ordenando a coleção
		Collections.sort(nomes);
		
		System.out.println();
		
		//usando o metodo forEach()		
		nomes.forEach(s -> System.out.println(s));
		
		
		
		}		
		
	

}
