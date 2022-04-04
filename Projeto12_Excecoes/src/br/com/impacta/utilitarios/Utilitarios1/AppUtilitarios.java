package br.com.impacta.utilitarios.Utilitarios1;

import javax.swing.JOptionPane;

import br.com.impacta.utilitarios.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		
		double soma = Utilitarios.somar(12, 15.6);
		//System.out.println(soma);	
	
		
		//String novaFrase = Utilitarios.removerEspacos("Está chovendo muito");
		
		//System.out.println(novaFrase);
		
		
		//System.out.println(Utilitarios.gerarEmail(" Lucas ", " Aragao "));
		
		
		//executando o metodo calcularMediaArray()
		double[] lista = {2.3, 4.5, 9.1, 10,8};
        double media = Utilitarios.calcularMediaArray(lista);
		
        //System.out.println("Média dos elementos do array: " + media);
		
        
        //executando o método calcularMediaNumeros()
        double m1 = Utilitarios.calcularMediaNumeros();
        double m2 = Utilitarios.calcularMediaNumeros(2,3);
        double m3 = Utilitarios.calcularMediaNumeros(9,8,4,6,1,7,6,0);
        double m4 = Utilitarios.calcularMediaNumeros(lista);
        
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("m3: " + m3);
        System.out.println("m4: " + m4);
        
        

		
	}
}
