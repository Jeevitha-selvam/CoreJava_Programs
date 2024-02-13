public class Loops         // Inner for loop                  
{    
public static void main	(String[]args){
	int week=4;
	int day=7;
    
	for(int i=1;i<=week;i++){		// outer  for condition
	
	  System.out.println(i+"week");
	  
	  for(int j=1;j<=day;j++){       // Inner for loop
		  
		  System.out.println(j+"day");
	  }
	  }

}
}