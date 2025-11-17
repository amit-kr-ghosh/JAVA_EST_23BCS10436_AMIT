 // Interface
interface Animal {
    void sound();     
}

// Abstract Class
abstract class Bird {
    abstract void fly();    

    void sleep() {           
        System.out.println("sleeping");
    }
}


class Sparrow extends Bird implements Animal {

    public void sound() {    
        System.out.println("chirps");
    }

    void fly() {            
        System.out.println("flies");
    }
}

public class Demo {
    public static void main(String[] args) {
        Sparrow s = new Sparrow();
        
        s.sound();  
        s.fly();   
        s.sleep();  
    }
}
