package com;

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

       

        public void printPostOrder(Node root){
            if(root == null){
                return;
            }
            printPostOrder(root.left);
            printPostOrder(root.right);
            System.out.print(root.data + " ");

        }

}


public class binaryTree {
    public static void main(String args[]){
        int[] nodes  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        preOrder p = new preOrder();
        preOrder.Node root = p.buildTree(nodes);
        System.out.println(root.data);
      
        System.out.println("Postorder sequence is:");
        p.printPostOrder(root);
    }
}
