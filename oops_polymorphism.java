class College{
    String name;
    int fees;

    public void printInfo(String name){
        this.name = name;
        System.out.println(name);
    }

    public void printInfo(int fees){
        System.out.println(this.fees);
    }

    public void printInfo(String name, int fees){
        System.out.println(this.name);
        System.out.println(this.fees);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        College c1 = new College();
        c1.fees = 1000;
        c1.printInfo("vit");
        c1.printInfo(c1.fees);
    }


}
