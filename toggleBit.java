import java.util.Scanner;

public class toggleBit {
    public static void  main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        System.out.print("Enter the position: ");
        int pos = s.nextInt();
        int bitMask1 = 1<<pos;
        if((n & bitMask1) ==0){
            System.out.println("Toggled output is: "+(n | bitMask1));
        }
        else{
            System.out.println("Toggled output is: "+(n & ~bitMask1));
        }
    }
}
