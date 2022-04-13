package br.com.impacta.threads;

public class Processo01 implements Runnable {

	@Override
	public void run() {
		
		//run é uma tarefa que vai ser executada pela thread.		
		 try {
				
	    	 for (int i = 0; i < 20; i++) {
	    		 
	    		 System.out.print("*");
	    		 Thread.sleep(250);   
			}
	    	
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}	
	
}
