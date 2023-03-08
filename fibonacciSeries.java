import java.util.*;

public class fibonacciSeries {
    public static void main(String args[]){
        System.out.print("Enter the number of terms required:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if(n>1){
            for(int i=2;i<n+1;i++){
                System.out.print (b + " ");
                int temp= b;
                b = a + b;
                a = temp;
            }
        }
    }
}
