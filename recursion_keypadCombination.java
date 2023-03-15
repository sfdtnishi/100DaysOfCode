public class keypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printComb(String num, int idx, String combination){
        if (idx == num.length()){
            System.out.println(combination);
            return;
        }
        char currChar = num.charAt(idx);
        String mapping = keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(num,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printComb("23",0,"");

    }
}
