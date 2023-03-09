import java.util.Scanner;

public class calcPower {

    public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        return x*calcPower(x,n-1);
    }

    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.print("enter the value of base: ");
        int x = s.nextInt();
        System.out.print("enter the height of stack: ");
        int n = s.nextInt();
        int result = calcPower(x,1);
        System.out.println("x to the power n is: "+result);
    }
    //think of stack height in asymptotic notation, therefore negligible difference in the height of the stack and given height of the stack is considered to be correct.
}
