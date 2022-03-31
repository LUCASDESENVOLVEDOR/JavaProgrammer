package br.com.impacta.aplicacao;

public class AppArray01 {
	public static void main(String[] args) {
		
		//definindo um array de inteiros  - parte1
		int[] numeros = new int[5];
		
		//atribuir valores individualmente.
		numeros[0] = 20;
		numeros[1] = 10;
		numeros[2] = -12;
		numeros[3] = 0;
		numeros[4] = 8;
		
		
			
		for(int i= 0; i < numeros.length; i++) {
			
			//qual o valor da posicao?
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		
		for(int i = numeros.length-1 ; i >= 0; i--) {
			
			System.out.println(numeros[i]);
		}
		
		
		//Não é possivel redimenssionar um array,
		// depois de criado não muda mais.
		
		
		
		
		
		
		
	}

}
