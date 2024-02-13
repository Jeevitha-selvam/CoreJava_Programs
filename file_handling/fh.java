package Practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class fh {

	public static void main(String[] args) {

		File rr=new File("E:\\Its_Me_R\\Alone\\BeHappy\\Music.txt");                      // String object
	    
		try {
			rr.createNewFile();
		
		FileWriter writer=new FileWriter(rr);
	     writer.write(65);                                           //input
	     writer.write("\n  -- Its Me R -- \n -- enjoy--");           //''     text  
	     writer.write("\n --jalliya iruka --");
	     writer.flush();                           // push 
	     
	     
	     
	     
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
