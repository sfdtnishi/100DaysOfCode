public class stringReverse {
    public static void reverseOrder(int n, String str){
        if(n==0){
            System.out.println(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(n));
        reverseOrder(n-1,str);
    }
    public static void main(String[] args) {
        String strName = "nishi";

        reverseOrder((strName.length()-1),strName);
    }
}
