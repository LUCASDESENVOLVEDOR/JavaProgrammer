package br.com.impacta.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet02 {
  public static void main(String[] args) {
	
	   Set<String> nomes = new  TreeSet<>();
	   nomes.add("Daniel");
	   nomes.add("Edgard");
	   nomes.add("Edson");
	   nomes.add("Kelly");
	   nomes.add("Cecilia");
	   nomes.add("Bruno");   
	   nomes.add("Kelly");
	   
	   
	   nomes.forEach(s -> System.out.println(s));
	  
}
}
