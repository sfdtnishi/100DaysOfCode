public class main{
  public static void removeMethod_1(int idx,String str, String s2){
    if(idx==str.length()){
      System.out.println(s2);
      return; 
    }
    if(s2.contains(Character.toString(str.charAt(idx)))){
      removeMethod_1(idx+1,str,s2);
    }
    else{
      s2 += str.charAt(idx);
      removeMethod_1(idx+1,str,s2);
    }
  }
  
  public static boolean[] map = new boolean[26];  //because there are 26 alphabets, the size of boolean array is 26. Initially in boolean array, all values are set as false.
  public static void removeByMap(int idx,String str, String s2){
    if(idx==str.length()){
      System.out.println(s2);
      return; 
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a']) // any character subtracted by 'a' will give its index number in the boolean map array. This line says that the currChar is present.
    {
      removeByMap(idx+1,str,s2);
    }
    else{
      map[currChar - 'a'] = true;
      s2 += currChar;
      removeByMap(idx+1,str,s2);
    }
  }
  
  
  public static void main(String args[]){
    String str = "abbcccdd";
    String s2 = "";
    removeMethod_1(0,str,s2);
    removeByMap(0,str,s2);
  }
}
