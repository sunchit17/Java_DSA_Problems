import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sn = new Scanner(System.in);
    System.out.println("Enter number of columns");
    int N = sn.nextInt();
    char[][] pattern = new char[3][N];
    System.out.println("Enter the pattern");
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<N;j++)
      {
        pattern[i][j] = sn.next().charAt(0);
      }
    }
    int[] d = new int[N];

    for(int i=0;i<3;i++)
    {
      for(int j=0;j<N;j++)
      {
        if(pattern[i][j] == '*')
          d[j] = d[j] + 1;
        else if(pattern[i][j] == '.')
          d[j] = d[j] + 0;
        else
          d[j] = d[j] + 2;
      }
    }

    Main ob = new Main();
    ob.print_pattern(d);
  }

  public void print_pattern(int[] d)
  {
    String s = "";
    for(int i=0;i<d.length;i+=3)
    {
      if(d[i] == 6){
        s = s + "#";
        i++;
      }
      if(d[i] == 0){
        i++;
      }
      if(d[i] == 3 && d[i+2] == 3)
      {
        if(d[i+1] == 1)
          s = s + "U";
        else if(d[i+1] == 2)
          s = s + "O";
        else
          s = s + "E";
      }
      if(d[i] == 2 && d[i+2] == 2)
      {
        if(d[i+1] == 2)
          s = s + "A";
        else
          s = s + "I";
      }
    }
    System.out.println(s);
  }
}
