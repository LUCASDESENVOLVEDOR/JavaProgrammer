package br.com.impacta.classes;

import br.com.impacta.interfaces.Documento;

public class DocumentoCnpj implements Documento {
	
	private String cnpj;
		
	public DocumentoCnpj(String cnpj) {
		super();
		this.setNumero(cnpj);
	}

	@Override
	public void setNumero(String numero) {
		 
		 //expressao regular.
		if(!numero.matches("[0-9]{14}")) {
			throw new NumberFormatException("O CNPJ  "
					+ "deve ter 14 digitos");
		}
		
		this.cnpj = numero;	
		
	}

	@Override
	public String getNumero() {		
		return this.cnpj;
	}

	

}
