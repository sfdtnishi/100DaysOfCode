package com.queue;

import java.util.*;

class queuee{
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;

    public static boolean isEmpty(){
        return head==null && tail == null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int result = head.data;
        if(head==tail){
            tail = null;
        }
        head = head.next;
        return result;


    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return head.data;
    }
}

public class circularQueueUsingLinkedList {
    public static void main(String[] args) {
        queuee q = new queuee();
//        Queue<Integer> q = new LinkedList<>();  // using collection framework
//        Queue<Integer> q = new ArrayDeque<>();   //here same class name is not used because Queue is an interface and interfaces don't have objects. LinkedList and ArrayDeque are the classes which have extended from Queue interface so we can use them.
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }


}
