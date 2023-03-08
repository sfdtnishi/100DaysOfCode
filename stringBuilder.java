import java.lang.*;

public class stringBuilder {
    public static void main(String args[]){
        //new string where 'e' is replaced with 'i'.
        Scanner s = new Scanner(System.in);
        System.out.println("enter any string: ");
        StringBuilder sb = new StringBuilder(s.next());
        for (int i=0; i<sb.length();i++){
            if(sb.charAt(i) =='e'){
                sb.setCharAt(i,'i');
            }
        }
        System.out.println("required string is: "+sb);

        //email to username
        System.out.print("enter email address: ");
        StringBuilder email = new StringBuilder(s.next());
        for (int i=0; i<email.length();i++){
            if(email.charAt(i) =='@') {
                email.delete(i,email.length());
            }}
        System.out.println("username is: "+email);
    }
}
