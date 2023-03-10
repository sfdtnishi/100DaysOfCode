import java.util.Scanner;

public class main{
  public static boolean check(int n, int[] arr){
    if(n==1){
      return true;
    }
    if(arr[n-2]>=arr[n-1]){
      return false;
    }
    return check(n-1,arr);
  }
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int  n = s.nextInt();
    int[] arr  = new int[n];
    for(int a:arr[]){
      arr[a] =s.nextInt();
    }
    check(n,arr);
  }
}
