import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter Text");
    String text = sn.nextLine();
    System.out.println("Enter Pattern");
    String pat = sn.nextLine();
    Main ob = new Main();
    ob.kmpsearch(pat,text);
  }
  public void kmpsearch(String pat,String text)
  {
    int M = pat.length();
    int N = text.length();
    int[] lps = new int[M];
    int j=0; //pat
    int i=0; //text
    computeLPS(pat,M,lps);

    while(i<N)
    {
      if(pat.charAt(j) == text.charAt(i))
      {
        i++;
        j++;
      }
      if(j==M)
      {
        System.out.println("Pattern Found at " + (i-j));
        j = lps[j-1];
      }
      else if(i<N && pat.charAt(j) != text.charAt(i))
      {
        if(j!=0)
          j = lps[j-1];
        else
          i++;
      }
    }
  }
  public void computeLPS(String pat,int M,int[] lps)
  {
    int len = 0;
    int i = 1;
    lps[0]=0;
    while(i<M)
    {
      if(pat.charAt(i) == pat.charAt(len))
      {
        len++;
        lps[i] = len;
        i++;
      }
      else
      {
        if(len!=0) //non-zero
        {
          len = lps[len-1];
        }
        else //zero
        {
          lps[i] = len;
          i++;
        }
      }
    }
  }
}
