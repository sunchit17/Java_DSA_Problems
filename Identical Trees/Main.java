import java.util.*;

class Node{
  int val;
  Node left;
  Node right;

  Node(int x){
    val = x;
    left = null;
    right = null;
  }
}

class Main{
  Node root1;
  Node root2;
  public static void main(String[] args){
    Main tree = new Main();
    tree.root1 = new Node(1);
    tree.root1.left = new Node(2);
    tree.root1.right = new Node(3);
    tree.root1.left.left = new Node(4);
    tree.root1.left.right = new Node(5);

    tree.root2 = new Node(1);
    tree.root2.left = new Node(2);
    tree.root2.right = new Node(3);
    tree.root2.left.left = new Node(4);
    tree.root2.left.right = new Node(6);

    if(tree.isIdentical(tree.root1, tree.root2) == true){
      System.out.println("Both Trees are identical");
    }
    else{
      System.out.println("Trees are not identical");
    }
  }

  public boolean isIdentical(Node root1, Node root2){
    if(root1 == null && root2 == null){
      return true;
    }
    if(root1 == null || root2 == null){
      return false;
    }

    return (root1.val == root2.val) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
  }
}
