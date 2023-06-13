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


       public int diameterApp1(Node root){
            if(root==null){
                return 0;
            }
            int leftdia = diameterApp1(root.left);
            int rightdia = diameterApp1(root.right);
            int dia3 = height(root.left)+height(root.right)+1;

            return Math.max(dia3,Math.max(leftdia,rightdia));
       }


}


public class binaryTree {
    public static void main(String args[]){
        int[] nodes  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        preOrder p = new preOrder();
        preOrder.Node root = p.buildTree(nodes);
        System.out.println(root.data);
       
        System.out.println("diameter of tree is by approach 1: ");
        int dia = p.diameterApp1(root);
        System.out.println(dia);

    }

}
