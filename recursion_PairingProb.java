public class main{
 public static int count(int n){
    if(n<=1){
        return 1;
    }
    int single = count(n-1);
    int pairs = (n-1)*count(n-2);
    return single+pairs;
}
    public static void main(String args[]){
        int guests = 3;
        System.out.println(count(guests));
    }
}
