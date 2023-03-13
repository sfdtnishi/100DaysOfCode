public class main{
  public static void subsequence(int idx, String str, String newStr){
    if(idx == str.length()){
      System.out.println(newStr);
      return;
    }
    String currChar = str.charAt(idx);
    subsequence(idx+1,str,newStr+currChar);
    subsequence(idx+1,str,newStr);
    
  }
  public static void main(String args[])
  {
    String str = "abc";
    String newStr = "";
    subsequence(0,str, newStr);
  }
}
