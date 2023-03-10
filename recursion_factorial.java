import java.util.Scanner;

public class factorial{
  public static int printFactorial(int n){
    if(n==1 || n==0){
      return 1;
    }
    return n*printFactorial(n-1);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fact = printFactorial(n);
    System.out.println(fact);
  }
}
