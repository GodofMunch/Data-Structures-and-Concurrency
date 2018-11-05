import java.util.Deque;
import java.util.LinkedList;

/**
   This class implements a binary search tree whose
   nodes hold objects that implement the Comparable
   interface.
*/

public class BinarySearchTree<E extends Comparable<E>> {

   private Node root;

   private class Node {
      public E data;
      public Node left;
      public Node right;
   }

   public BinarySearchTree() {
      root = null;
   }

   public void insert(E e) {
      Node newNode = new Node();
      newNode.data = e;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
         root = newNode;
      else
         insertSub(root, newNode);
   }

   private void insertSub(Node node, Node newNode) {
      int result = node.data.compareTo(newNode.data);
      if (result >= 0) {
         //go left
         if (node.left == null) {
            node.left = newNode;
         } else {
            insertSub(node.left, newNode);
         }
      } else {
         //go right
         if (node.right == null) {
            node.right = newNode;
         } else {
            insertSub(node.right, newNode);
         }
      }
   }


   public void print() {
      if (root != null)
         printSub(root);
   }

   private void printSub(Node node) {
      if (node != null) {
         printSub(node.left);
         System.out.println(node.data);
         printSub(node.right);
      }
   }

   public void printPreOrderIterative() {
       Deque<Node> stack = new LinkedList<>();
       Node newNode;
       stack.addFirst(root);

       while(!stack.isEmpty()){
           newNode = stack.removeFirst();
           System.out.println(newNode.data);


           if(newNode.right != null)
                stack.addFirst(newNode.right);
           if(newNode.left != null)
               stack.addFirst(newNode.left);


       }
   }

   public void printBreadthFirstIterative() {
       Deque<Node> tree = new LinkedList<>();
       Node newNode;
       tree.addFirst(root);

       while(!tree.isEmpty()){
           newNode = tree.removeFirst();

           System.out.println(newNode.data);


           if(newNode.left != null)
               tree.addLast(newNode.left);
           if(newNode.right != null)
               tree.addLast(newNode.right);
       }
   }
}