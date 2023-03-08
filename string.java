import java.util.*;
import java.lang.*;

public class strings {
    public static void main(String args[]){
        //parseInt
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        //toString
        int marks = 123;
        String score = Integer.toString(marks);
        System.out.println(str.length());

        //combined length of all strings in the array
        Scanner s = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int arrLen = s.nextInt();
        String[] arr = new String[arrLen];
        int length=0;
        for (int i = 0; i<arr.length; i++){
            arr[i] = s.next();
            length += arr[i].length();
        }
        System.out.println("the length of all strings in the array is: "+ length);

        //new string where 'e' is replaced with 'i'.
        String old = s.next();
        String result = "";
        for(int i=0;i<old.length();i++){
            if (old.charAt(i)=='e'){
                result += 'i' ;
            }
            else{
                result = result + old.charAt(i);
            }
        }
        System.out.println("result is: "+result);

        //email to username

        System.out.print("enter email address: ");
        String email = s.next();
        String username = "";

        for(int i=0;i<email.length();i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            else {
                username += email.charAt(i);
            }
        }
        System.out.println("username is: "+username);
    }
}
