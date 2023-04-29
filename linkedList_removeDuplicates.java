public ListNode deleteDuplicates(ListNode head) {
         ListNode currNode = head;

         if(head==null){
             return head;
         }

         while(currNode.next!=null ){
             if(currNode.next.val==currNode.val){
                 currNode.next =currNode.next.next;
                   continue;
             }
             
             currNode = currNode.next;
         }
         return head;
        // ListNode temp = head;
        // while (temp != null && temp.next != null)
        // {
        //     if (temp.next.val==temp.val)
        //     {
        //         temp.next=temp.next.next;
        //         continue;
        //     }
        //     temp=temp.next;
        // }
        // return head;
    }
