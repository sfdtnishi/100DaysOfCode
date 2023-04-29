public ListNode findMiddle(ListNode head){
        ListNode prev = head;
        ListNode curr = head;
        while(  curr.next != null && curr.next.next != null) // here writing the condition in this order is important
        {
            curr = curr.next.next;
             prev= prev.next;
        }
        
        return prev;
    }
    
    public ListNode reverse(ListNode head){
    
        
        ListNode prevNode =  null;
        ListNode currNode = head;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }

        ListNode middle = findMiddle(head);
        ListNode reverseHead = reverse(middle.next);

        ListNode curr = head;
        while(reverseHead!=null){
            if(curr.val != reverseHead.val){
                return false;
            }
            curr =curr.next;
            reverseHead = reverseHead.next;
        }
        return true;
    }
