class ll {
     Node head;
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    //addFirst
    public void addFirst(String data){

        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //addLast
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print list
    public void printList(){
        Node currNode = head;

        while(currNode!=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    //remove first element

    public void removeFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        if(last.next==null){
            head=null;
        }

        while(last.next!=null){
         last = last.next;
         secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
}

public class LinkedListLL {
    public static void main(String[] args) {
      ll list = new ll();
      list.addFirst("am");
      list.addLast("Nishi");
      list.addLast("Jain");
      list.addFirst("I");
      list.printList();

      list.removeFirst();
        list.printList();

list.removeLast();
        list.printList();

    }

}
