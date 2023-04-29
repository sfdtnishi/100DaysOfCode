public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head.next==null){
           return null;
       }
        int size =0;
        ListNode currNode = head;
        while(currNode!=null){
            currNode = currNode.next;
            size++;
        }
       
       if(n==size){
           return head.next;
       }
        int prev = size-n;
  
        currNode = head;
        int i =1;
        while(i<prev){
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;
        return head;
    }
