public class main{
  public static int first = -1;
    public static int last = -1;
    public static void occurrence(int n,String str,char element) {
        if (n == str.length()) {
            return;
        }
        if (str.charAt(n) == element) {
            if (first == -1){
                first = n;
        } else {
            last = n;
        }
    }
        occurrence(n+1,str,element);
    }
    public static void main(String args[]){
        String str = "nissiihil";
        char element = 'i';
        occurence(0,str,element);
        System.out.println("first occurrence: "+first);
        System.out.println("last occurrence: "+last);
    }
}
