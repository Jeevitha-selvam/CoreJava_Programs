interface school{  
    void class();  
}  
  
interface student {  
    void roll();  
}  
  
class Warrior implements school, student {  
    public void class() {  
        System.out.println("checking will done class by class");  
    }  
  
    public void roll() {  
        System.out.println("Enter student roll in register");  
    }  
}  
  
class Mage implements school, student  {  
    public void class() {  
        System.out.println("All the classes are want to assemble in prayer");  
    }  
  
    public void roll() {  
        System.out.println("Take the attenance roll number wise");  
    }  
}  
  
public class MultipleInheritance {  
    public static void main(String[] args) {  
        Warrior warrior = new Warrior();  
        Mage mage = new Mage();  
  
        warrior.class(); // Output: checking will done class by class  
        warrior.roll(); // Output: Enter student roll in register  
  
        mage.class(); // Output: All the classes are want to assemble in prayer  
        mage.roll(); // Output: Take the attenance roll number wise  
    }  
}  