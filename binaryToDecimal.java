package com.practice;
import java.util.Scanner;

public class decimalBinaryConversion {

    public static int BinaryToDecimal(int num) {
        int base = 1;
        int decimal = 0;
        while(num>0){
            int lastDigit = num%10;
            num /= 10;
            decimal = decimal + (lastDigit*base);
            base *= 2;
            System.out.println(lastDigit+" "+num+"  "+decimal+" "+base);
        }
        return decimal;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the binary number: ");
        int num = s.nextInt();
        int result=BinaryToDecimal(num);
        System.out.print(num+" in decimal will be: "+result);
    }
}
