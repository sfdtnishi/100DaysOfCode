public class main{
  public static int mazePaths(int m, int n, int i, int j){
    if(i==m || j==n){
      return 0;
    }
    if(i==m-1 && j==n-1){
      return 1;
    }
    int rightPaths = mazePaths(m,n,i+1,j);
    int downPaths = mazePaths(m,n,i,j+1);
    return rightPaths+downPaths;
  }
  public static void main(String args[])
  {
    int rows = 3;
    int cols =3;
    mazePaths(rows, cols, 0, 0);
  }
}
