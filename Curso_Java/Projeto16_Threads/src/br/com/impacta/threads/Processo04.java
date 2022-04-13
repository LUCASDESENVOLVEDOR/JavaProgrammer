package br.com.impacta.threads;

public class Processo04 implements Runnable {

	
	public int total;
	
	@Override
	public void run() {
		
		try {
			
			synchronized(this) {
			
			for (int i = 0; i < 200; i++) {
				total  += i;
			}
			
			Thread.sleep(5000);
			
			notify();
			
			//notifyAll();
			
		}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}

