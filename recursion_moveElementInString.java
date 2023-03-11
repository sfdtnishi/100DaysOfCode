public class main{
  public static int count =0;
    public static String moveAllX(int idx,String old, String newstr, int oldLen){
        if(idx==oldLen){
            for(int i =0;i<(oldLen-count);i++){
                newstr += 'x';
            }
            return newstr;
        }
        if(old.charAt(idx)!='x'){
            newstr += old.charAt(idx);
            count += 1;
        }
        return moveAllX(idx+1,old,newstr, oldLen);
    }
    public static void main(String args[]){
        String original = "abxbxxtx";
        String newstr = "";
        // 'x' has to be shifted at last of the new string.
        System.out.println( moveAllX(0,original,newstr, original.length()));
    }
}
