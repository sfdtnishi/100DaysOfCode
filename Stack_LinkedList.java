package com.stack;

class StackClass {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Stack {
        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {

            if (isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;

            return top.data;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }

    }
}
public class stackUsingLinkedList {

    public static void main(String[] args) {
        StackClass sc = new StackClass();
        StackClass.Stack s = sc.new Stack();
        System.out.println(s.peek());

        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.peek());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }

    }
}
