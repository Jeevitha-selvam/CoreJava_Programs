package jeevi_practice;

import java.io.File;
import java.io.IOException;

public class filehandling {

	public static void main(String[] args) {
		File file=new File("C:\\jeevi\\javafolder\\javaio\\jeevi.txt");
		
		boolean present=file.exists();
		System.out.println(present);
		
		if(present==false)
		{
//				boolean cr=file.mkdirs();
//				System.out.println("file is created "+cr);	
//		}
		
		try 
		{
			boolean created=file.createNewFile();
			System.out.println(created);
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		file.delete();
		System.out.println(file.exists());

	}

}
