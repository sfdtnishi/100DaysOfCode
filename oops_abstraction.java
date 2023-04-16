abstract class Animal
{
    abstract void walk();
    Animal(){
        System.out.println("this is an animal");
    }
}

class horse extends Animal{
    public void walk(){
        System.out.println("it has 4 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        horse h = new horse();
        h.walk();
    }
}
