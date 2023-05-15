package com.queue;


class circularQueue{
    static int arr[];
    static int size;
    static int front = -1;
    static int rear = -1;

    circularQueue(int n){
        arr = new int[n];
        this.size = n;
    }

    public static boolean isEmpty(){
        return (front==-1 && rear==-1);
    }

    public static boolean isFull(){
        return (rear+1)%size == front;
    }

    //enqueue
    public static void add(int data){
        if(isFull()){
            System.out.println("queue is full");
        }
        if(front==-1){
            front=0;
        }
        rear = (rear+1)%size;
        arr[rear]=data;
    }

    //dequeue
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int result = arr[front];
        if(rear==front){
            rear = front = -1;
        }
        else {
            front = (front + 1) % size;
        }
        return result;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }

        return arr[front];
    }

}


public class circularQueueUsingArray {
    public static void main(String[] args) {
        circularQueue cq = new circularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.remove();
        cq.add(5);
        cq.add(6);

        while(!cq.isEmpty()){
            System.out.println(cq.peek());
            cq.remove();
        }
    }
}
