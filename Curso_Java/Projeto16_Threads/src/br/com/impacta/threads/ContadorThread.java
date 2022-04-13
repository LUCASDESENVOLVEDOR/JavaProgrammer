package br.com.impacta.threads;

public class ContadorThread extends Thread {

	@Override
	public void run() {
	 
	    try {
			
	    	 for (int i = 0; i < 20; i++) {
	    		 
	    		 System.out.println("*");
	    		 Thread.sleep(250);   
			}
	    	
	    	
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
		
	}
	
	
	

}
