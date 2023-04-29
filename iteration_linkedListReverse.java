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
