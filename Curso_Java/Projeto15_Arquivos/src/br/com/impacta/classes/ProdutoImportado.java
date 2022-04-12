package br.com.impacta.classes;

public class ProdutoImportado extends Produto {
	
	private double taxaImportacao;
		
	
	public ProdutoImportado(String categoria,
			String descricao, double preco) {
		super(categoria,descricao,preco);//representa o construtor da superclasse.		
	}
	
	public ProdutoImportado(String categoria,
			String descricao, 
			double preco, 
			double taxaImportacao) {
		
		this(categoria,descricao, preco); //this comunicacao com a 
		                                  //sobrecarga do construtor
		
		this.setTaxaImportacao(taxaImportacao); //acionando o metodo
		                                   //setTaxaImportacao
		
		
	}
	
	

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}

	@Override
	public String mostrar() {		
		return super.mostrar() +  "\nTaxa de Importação:" 
		+ this.getTaxaImportacao() ;
	}	
	
	
	
	
	
	

}









