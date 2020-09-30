import java.util.*;

class Main{
  public static void main(String[] args)
  {
    int[] arr = {1,2,4,4,4,4,5};
    int first = findFirst(arr,5);
    if(first!=-1)
    {
      int last = findLast(arr,5);
      int count = last-first+1;
      System.out.println(count);
    }
    else{
      System.out.println("No occurence");
    }
  }

  public static int findFirst(int[] arr,int X){
    int low = 0;
    int high = arr.length-1;
    int result = -1;
    while(low<=high)
    {
      int mid = low+(high-low)/2;
      if(arr[mid] == X)
      {
        result = mid;
        high = mid-1;
      }
      else if(arr[mid] > X)
      {
        high = mid-1;
      }
      else
        low = mid+1;
    }
    return result;
  }

  public static int findLast(int[] arr,int X){
    int low = 0;
    int high = arr.length-1;
    int result = -1;
    while(low<=high)
    {
      int mid = low+(high-low)/2;
      if(arr[mid] == X)
      {
        result = mid;
        low = mid+1;
      }
      else if(arr[mid] > X)
      {
        high = mid-1;
      }
      else
        low = mid+1;
    }
    return result;
  }
}
