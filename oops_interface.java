interface Animals{
    void walk();
}

interface herbivore{

}

class Horses implements Animals, herbivore{

    public void walk() {
        System.out.println("walks with 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Horses h = new Horses();
        h.walk();
    }
}
