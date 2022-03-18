package br.com.impacta.relacionais_logicos;

public class OperadoresRelacionais02 {
	public static void main(String[] args) {
		
		int a = 10, b= 20;
		
		//&& todas as condicoes devem ser TRUE		
		boolean b1 = (a <= 10) && (b % 2 == 0);
		
		              // T         //F        // F
		boolean b2 = (a == 10) || (a == b) || (b> 20);
		
		System.out.println("b2: " + b2);
		
		
		
		// || vai comparar até ter um true
		// |  vai comparar todas as condicoes mesmo que 
		       //tenha true.
		
		
		// && vai comparar até ter um false
		
		// & vai comparar a todas as condicoes
		   // mesmo que tenha false.
		
		
		
		
	}

}
