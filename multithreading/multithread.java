package Practice;


 class rr extends Thread {
	  public void run () { 
		  
		  for(int i=1;i<=5;i++)
			 
		  System.out.println(" one  : "+ i);
	  }	  
 }


public class multithread {

	public static void main(String[] args)throws InterruptedException{
		rr oo= new rr();
		
		oo.start();
		//oo.join();
		
		Thread.yield();
		for(int i=1; i<=5;i++) {
			System.out.println(" two : "+i);
			
		}

	}

}
