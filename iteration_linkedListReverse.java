 public void reverseLinkedList(){
    Node prev = head ;
        Node currNode = head.next;

        if(head==null || head.next == null){
            return;
        }

        while(currNode!=null){
            Node nextNode = currNode.next;
            currNode.next = prev;

            prev = currNode;
            currNode = nextNode;
        }
        head.next  = null;
        head = prev;
    }
