class ConstructorDemo{    
    int id;    
    String name;    
    //constructor to initialize integer and string    
    ConstructorDemo(int i,String n){    
    id = i;    
    name = n;    
    }    
    //constructor to initialize another object    
    ConstructorDemo(ConstructorDemo c){    
    id = c.id;    
    name =c.name;    
    }    
    void display()
	{
		System.out.println(id+" "+name);
	}    
    public static void main(String args[]){    
        ConstructorDemo c1 = new ConstructorDemo(100,"Joy");    
        ConstructorDemo c2 = new ConstructorDemo(c1);    
    c1.display();    
    c2.display();    
   }    
} 