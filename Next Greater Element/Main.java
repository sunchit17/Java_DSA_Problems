import java.util.*;

class Main{
  public static void printNGE(int[] arr,int n)
  {
    Stack<Integer> s = new Stack<>();
    s.push(arr[0]);
    for(int i=1;i<n;i++)
    {
      if(s.isEmpty())
      {
        s.push(arr[i]);
        continue;
      }
      while(s.isEmpty()==false && s.peek()<arr[i])
      {
        System.out.println(s.peek()+" --- "+ arr[i]);
        s.pop();
      }
      s.push(arr[i]);
    }
    while(s.isEmpty() == false)
    {
      System.out.println(s.peek()+" --- "+"-1");
      s.pop();
    }
  }
  public static void main(String[] args)
  {
    int[] arr = {11,13,21,3};
    int n = arr.length;
    printNGE(arr,n);
  }
}
