package com;

class binarytree{

    
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

        

        public void printInOrder(Node root){
            if(root == null){
                return;
            }
            printInOrder(root.left);
            System.out.print(root.data+" ");
            printPreOrder(root.right);

        }


}


public class binaryTree {
    public static void main(String args[]){
        int[] nodes  = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree p = new binarytree();
        binarytree.Node root = p.buildTree(nodes);
        System.out.println(root.data);
  
        System.out.println("inorder sequence is:");
        p.printInOrder(root);
        System.out.println();
     
    }
}
