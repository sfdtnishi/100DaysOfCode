package com.stack;

import java.util.Stack;

public class reverseStack {
    public static void bottomInsert(int data, Stack<Integer> st){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        bottomInsert(data, st);
        st.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top  = s.pop();
        reverse(s);
        bottomInsert(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);


        reverse(s);
        System.out.println("After reversing");
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
