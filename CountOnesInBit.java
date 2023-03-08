import java.util.Scanner;

public class count1inBits {
    public static int lengthOfBit(int n) {
        int len = 0;
        while (n != 0) {
            n = n >> 1;
            len += 1;
        }
        return len;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int length = lengthOfBit(n);
        for (int j = 0; j < length; j++) {
            int bitMask = 1 << j;
            if ((bitMask & n) != 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
