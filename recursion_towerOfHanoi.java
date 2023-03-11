public class main{
  public static void towerOfHanoi(int n,String source, String helper, String dest){
    if(n==1){
      System.out.println("transfer disc"+n+"from"+source+"to"+dest);
      return;
    }
    towerOfHanoi(n-1,source,dest,helper);
    System.out.println("transfer disc"+n+"from"+source+"to"+dest);
    towerOfHanoi(n-1,helper,source,dest);
  }
  public static void main(String args[]){
    int n = 4;
    towerOfHanoi(n,"S","H","D");
  }
}
