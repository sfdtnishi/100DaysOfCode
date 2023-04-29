public Node reverseRecursion(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
