package br.com.impacta.inteiros;

public class VariaveisShort {
public static void main(String[] args) {
		
		//tipo  nome da variavel
		// = atribuicao
		short idade  = 80; // -128 a 127
		short idade2 = 48;
		
		//somando as duas idades, e armazenando em uma
		 //terceira variavel
		short soma = (short)(idade + idade2);	//typecast	
			
		System.out.println("Soma das idades: " + soma);
		
		
		System.out.println(idade2);
		
	}
}
