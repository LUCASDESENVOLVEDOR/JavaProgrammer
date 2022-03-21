package br.com.impacta.estruturawhile;

public class EstruturaWhile01 {
	
	public static void main(String[] args) {
		
		
		int numero =(int) (Math.random() * 20);
		
		//System.out.println("numeroGerado: " + numero);
		while(numero < 10) {
			System.out.println(numero++);
		}
		
		System.out.println("--FIM DO PROGRAMA--");
		
		
	}

}
