package br.com.impacta.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

import br.com.impacta.classes.Curso;

public class AppSet05 {
	public static void main(String[] args) {
		
		Set<Curso> cursos = new LinkedHashSet<>();
		cursos.add(new Curso(100, "PHP", 100,1200));
		cursos.add(new Curso(200, "Inglês", 100,1500));
		cursos.add(new Curso(300, "C#", 8,2000));
		cursos.add(new Curso(100, "PHP", 100,1200));
		
		cursos.forEach(s -> System.out.println(s.mostrar() + "\n"));
		
		
		
	}

}
