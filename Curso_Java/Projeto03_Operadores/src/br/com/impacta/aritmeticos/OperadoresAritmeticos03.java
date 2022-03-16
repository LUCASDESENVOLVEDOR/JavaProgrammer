package br.com.impacta.aritmeticos;

/*
 * Nessa classe apresentaremos os conceitos 
 * de operadores de atribuição reduzida:
 * 
 * +=
 * -=
 * *=
 * /=
 * %= 
 * 
 * */

public class OperadoresAritmeticos03 {
	public static void main(String[] args) {
		
		int a = 10,
		    b = 3;
		
		//a = a * 2 
		
		a *= 2;     //a = 20
		b /= 3;     //b  =1		
				
		a += b;       //a = 21	
		
		
		// 1 = 1 - (a+1)		
		// 1 = 1-22	
		
		b -= (a+1);   // b = -21
		
		a %=2;   // a= 1
		
		System.out.println("a = " + a );
		System.out.println("b = " + b);
		
		
		
	}

}
