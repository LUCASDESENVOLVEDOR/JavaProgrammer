package br.com.impacta.estruturawhile;

public class EstruturaWhile02 {
public static void main(String[] args) {
		
		
		int numero =(int) (Math.random() * 20);
		
		//fa�a
		do {
			
			System.out.println(numero++);
			
		}
		
	   	while(numero < 10); //enquanto
		
		System.out.println("--FIM DO PROGRAMA--");
		
		
	}
}
