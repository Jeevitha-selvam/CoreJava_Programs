package Java;

import java.util.Scanner;

public class imports {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in); 
		
		System.out.println("enter the  string");   // input String
		String s=sc.nextLine();
		
		
		System.out.println("enter the int");    //input integer
		int a=sc.nextInt();
		
		
		System.out.println("enter the char");    //input char
		char a1=sc.next().charAt(3);
		
	    System.out.println(s);
		System.out.println(a);
		System.out.println(a1);
	}
}
