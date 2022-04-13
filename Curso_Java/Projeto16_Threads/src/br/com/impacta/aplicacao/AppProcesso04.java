package br.com.impacta.aplicacao;

import br.com.impacta.threads.Processo04;

public class AppProcesso04 {

	public static void main(String[] args) {
		
		Processo04 proc = new Processo04();
		Thread t = new Thread(proc);
		t.start();
		
		synchronized(t) {
			
			try {
				
				System.out.println("Estou esperando...");
				//aguardando/esperando
				t.wait();
				
			} catch (Exception e) {
				
			}
			
					
			System.out.println("Total é igual a :" + proc.total);
			
			
			
			
		}
		
		
		
		
		

	}

}
