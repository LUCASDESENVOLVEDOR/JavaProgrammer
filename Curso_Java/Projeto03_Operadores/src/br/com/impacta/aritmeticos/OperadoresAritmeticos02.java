package br.com.impacta.aritmeticos;

public class OperadoresAritmeticos02 {
  public static void main(String[] args) {
	
	  int a = 10, //a uma var...
			  b = 3,
			  c = 5;
	  
	  double d1 = 10, d2 = 3;
	  
	  double divisao1 = d1/d2;	  
	  
	  //divisao real com base em numeros inteiros
	  double divisao2 = d1/b; 
	         //para teros um divisao real, 
	         //basta que apenas um dos operadores seja 
	         // real
	  
	                    //typecast do a(int) 
	                       //para double.
	  double divisao3 = (float)a/b;
	                    
	  double x = a;
	  double divisao4 = x/b;	  
	  
	  
	  System.out.println("divisao1: " + divisao1);
	  System.out.println("divisao2: " + divisao2);	  
	  System.out.println("divisao3: " + divisao3);
	  System.out.println("divisao4: " + divisao4);
}
}
