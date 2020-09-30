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
  Node root;
  static int result = Integer.MIN_VALUE;
  public static void main(String[] args){
    Main tree = new Main();
    tree.root = new Node(1);
    tree.root.left = new Node(-10);
    tree.root.right = new Node(-12);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.right = new Node(7);

    tree.maxPathSum(tree.root);
    System.out.println("Maximum Path Sum = " + result);
  }
  public int maxPathSum(Node root){
    if(root == null)
      return 0;

    int l = maxPathSum(root.left);
    int r = maxPathSum(root.right);

    int temp = Math.max(Math.max(l,r)+root.val, root.val);
    int ans = Math.max(temp, l+r+root.val);

    result = Math.max(result, ans);

    return temp;
  }
}
