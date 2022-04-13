package br.com.impacta.classes;

import java.util.Comparator;

public class OrdenacaoDescricao implements Comparator<Produto> {

	@Override
	public int compare(Produto o1, Produto o2) {
		
		return o1.getDescricao().compareTo(o2.getDescricao());
		
	}

}
