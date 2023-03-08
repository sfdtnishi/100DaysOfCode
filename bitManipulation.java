import java.util.*;

public class bitManipulation {
    public static void main(String args[]){
        int n  = 5;
        //Get the 3rd bit(position 2) of a number n
        int gbitMask = 1<<2;
        int getBit = n & gbitMask;
        if((gbitMask & n) ==0){
            System.out.println("number: "+getBit+", Bit at 3rd position is zero");
        }
        else{
            System.out.println("number: "+getBit+", Bit at 3rd position is one");
        }

        // Set the 2nd bit(position 1) of a number n
        int sbitMask = 1<<1;
        int setBit = n | sbitMask;
        System.out.println("Bit has been set: "+setBit);

        //Clear the 3rd bit of number n
        int cbitMask = ~(1<<2); //performing negation of bitMask
        int clearBit = n & cbitMask;
        System.out.println("Bit has been cleared: "+clearBit);

        //Update the 2nd bit(1st position) to 0 or 1
        int ubitMask = 1<<1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to be updated: ");
        int bit = s.nextInt();
        if(bit==1){
            int updateBit1 = n | ubitMask;
            System.out.println("Bit updated to 1: "+updateBit1);
        }
        else{
            int nupdateBit = ~(ubitMask);
            int updateBit0 = n & nupdateBit;
            System.out.println("Bit updated to 0: "+updateBit0);
        }

    }

}
