public class main{
  public static int count(int m, int n){
    if(n==m){
      return 2;
    }
    if(n<m){
    return 1;
    }
    int vert = count(m,n-m);
    int horz = count(m,n-1);
    return vert+horz;
  }
  public static void main(String args[]){
    int m = 2;
    int n = 4;
    System.out.println(count(m,n));
}
}
