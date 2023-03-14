import java.util.HashSet;
public class main{
  public static void uniqueSub(int idx, String str, String newStr, HashSet<String> set){
    if(idx==str.length()){
        set.add(newStr);
        return;
    }
    uniqueSub(idx+1,str,newStr+ str.charAt(idx),set);
    uniqueSub(idx+1,str,newStr,set);
}
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSub(0,str,"",set);
        System.out.println(set);
    }
}
