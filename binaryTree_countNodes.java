package com;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Queue;

class preOrder{

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        public static int i = -1;

        public Node buildTree(int[] nodes){
            i++;
            if(nodes[i]==-1){
                return null;
            }
            Node newNode = new Node(nodes[i]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes) ;
            return newNode;
    }

        

        public int countNode(Node root){
            if(root==null){
                return 0;
            }
            int leftnodes  = countNode(root.left);
            int righttnodes  = countNode(root.right);

            return leftnodes+righttnodes+1;
        }

        
  
      
}


public class binaryTree {
    public static void main(String args[]){
        int[] nodes  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        preOrder p = new preOrder();
        preOrder.Node root = p.buildTree(nodes);
        System.out.println(root.data);
        p.printPreOrder(root);
        System.out.println();
       
        System.out.println("Total number of nodes are: ");
        int ans = p.countNode(root);
        System.out.println(ans);
      
        

    }

}
