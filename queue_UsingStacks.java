package com.queue;

import java.util.Stack;

class QueueS{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static Boolean s1isEmpty(){
        return s1.isEmpty();
    }
    public static Boolean s2isEmpty(){
        return s2.isEmpty();
    }

    public static void add(int data){

        while(!s1isEmpty()){
            int ele = s1.pop();
            s2.push(ele);
        }
        s1.push(data);
        while(!s2isEmpty()){
            int ele = s2.pop();
            s1.push(ele);
        }
    }

    public static int remove(){
        if(s1isEmpty()){
            System.out.println("queue empty");
            return -1;
        }
        return s1.pop();
    }

    public static int peek(){
        if(s1isEmpty()){
            System.out.println("queue empty");
            return -1;
        }
        return s1.peek();
    }
}



public class queueUsingTwoStacks {
    public static void main(String[] args) {
        QueueS q = new QueueS();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.s1isEmpty()){
        System.out.println(q.peek());
        q.remove();}

    }

}
