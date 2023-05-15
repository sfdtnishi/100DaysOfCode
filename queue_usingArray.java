package com.queue;

class Queue{
    static int arr[];
    static int size;
    static int rear = -1;

    Queue(int n){
        arr = new int[n];
        this.size = n;
    }

    public static boolean isEmpty(){
        return rear==-1;
    }

    //enqueue
    public static void add(int data){
        if (rear == size-1){
            System.out.println("Array is full");
            return;
        }
        rear++;
        arr[rear]=data;
    }

    //dequeue
    public static int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];
        for (int i=0;i<rear;i++){
            arr[i]= arr[i+1];
        }
        rear--;
        return front;
    }


    public static int peek(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int front = arr[0];
        return front;
    }
}

public class queueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
