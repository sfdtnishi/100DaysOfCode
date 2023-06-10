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

       

        public void printLevelOrder(Node root){
            if(root==null){
                System.out.println("tree is empty");
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){

                Node newNode = q.remove();
                if(newNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else {
                    System.out.print(newNode.data+" ");
                    if (newNode.left != null) {
                        q.add(newNode.left);
                    }
                    if (newNode.right != null) {
                        q.add(newNode.right);
                    }
                }
            }
        }

}


public class binaryTree {
    public static void main(String args[]){
        int[] nodes  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        preOrder p = new preOrder();
        preOrder.Node root = p.buildTree(nodes);
        System.out.println(root.data);
        
        System.out.println();
        System.out.println("Levelorder sequence is:");
        p.printLevelOrder(root);
    }
}
