package Practice;

import java.io.File;
import java.io.IOException;

public class ff {

	
	public static void main(String []rs ) {
		
		File rr=new File("E:\\Its_Me_J\\Alone\\BeHappy\\Music.txt");
		boolean present=rr.exists();
		System.out.println("file present "+ present);
//		
//		if (present==false) {
//		
//				boolean created=rr.mkdirs();
//				System.out.println("file present "+ created);
//			}
		
		boolean present1=rr.exists();
	System.out.println("file present "+ present1);
	if (present1==false) {
		
		try {
			boolean created = rr.createNewFile();
			System.out.println(created);
		} catch (IOException e) {
			
			System.out.println("IOEXCEPTION");
			
		}
		
		}
	present=rr.exists();
	System.out.println("file present "+ present);
	rr.delete();
	present=rr.exists();
	System.out.println("file present "+ present);
		
		// rename 

		try {
			boolean created = rr.createNewFile();
			System.out.println(created);
			} catch (IOException e) {
			
			System.out.println("IOEXCEPTION");
			
		}	
		File ra=new File("C:\\dhiva\\zara\\rra.txt");
	    boolean renamecheak=rr.renameTo(ra);
	    
	    System.out.println(renamecheak);
	    System.out.println(rr.getName());
	    System.out.println(ra.getName());
	    
	    System.out.println(ra.canExecute());  //check
	    System.out.println(ra.canRead());
	    System.out.println(ra.canWrite());
	    
	    File dd=new File("C:\\dhiva\\zara");
	    
	    String lis[]=dd.list();           //string
	    for(int i=0;i<lis.length;i++) {
	    	System.out.println("folderlist" + lis[i]);
	    }
        	File [] fileorderlist=dd.listFiles();  // array
        	
        	for(File f:fileorderlist)
        		if(f.isFile())             //find location
        			System.out.println(f);
        	// text file listing
        	
	}

}






// file.exists();     method is used to check
// mkdir()     used to create single file
//mkdirs()      used to create multi files
//obj.createNewFile()  used  create one file
//obj.delete( )   delete last file (or) folder
