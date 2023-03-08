package com.practice;
import java.util.*;

public class GCDof2No {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int a = s.nextInt();
        System.out.print("Enter 2nd no: ");
        int b = s.nextInt();
        while(a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.print("The Greatest Common divisor of given numbers is: ");
        System.out.print(a);

    }
}
