// Printing the keypad combination: There is a keypad having 0-9 options, and each option has a string of letters(say, for index 1, the string is "abc"). The user has to input the numbers in the form of a string. The number entered by the user corresponds to whichever index of the keypad, and the combination of letters of those strings would be printed.
// For this, the recursive function takes three parameters, the first is the input string, the second is the index and the third is the combination(initially empty) string to store all the combinations of the keypad.
// Initially, the index is zero, so for the zeroth index, the number of the inputted string would be stored in a variable(here currChar), that number has to be searched in the keypad as an index. Since the number is in the string format, the number in the character datatype is subtracted from the character zero, to get the index number of the keypad. Once we get the index number, we run a for loop for the string stored on that index and we concatenate the character of that string in the recursive function call inside the for loop, with the index incremented by one. By this now the recursive function will call itself, now for the next index value of the inputted string, again the for loop will be run. When the index value of the string equates to the length of the input string, the combination will be printed.
// Note: The recursive function always calls itself before reaching the end of the for the loop at the current level of depth. 
// Here, a tree like structure can be visualize to know the working of recursive calls inside the for loop.
    
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
