import java.util.*;

/*
1 1 1 0
1 1 1 0
0 0 0 0
1 0 1 0

Output - 3
*/
class Main{
  public static int noOfIslands(char[][] grid)
  {
    int count = 0;
    for(int i = 0;i<grid.length;i++)
    {
      for(int j=0;j<grid[0].length;j++)
      {
        if(grid[i][j] == '1')
        {
          count++;
          dfs(grid,i,j);
        }
      }
    }
    return count;
  }
  public static void dfs(char[][] grid,int i,int j)
  {
    if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] == '0')
      return;
    if(grid[i][j] == '1'){
    grid[i][j] = '2';
    dfs(grid,i+1,j);
    dfs(grid,i-1,j);
    dfs(grid,i,j+1);
    dfs(grid,i,j-1);}
  }
  public static void main(String[] args)
  {
    char[][] grid = {{'1','1','1','0'},{'1','1','1','0'},{'0','0','0','0'},{'1','0','1','0'}};
    int num = noOfIslands(grid);
    System.out.println("Number of Islands = " + num);
  }
}
