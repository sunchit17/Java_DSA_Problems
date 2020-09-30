import java.util.*;

class Main{
  public static void main(String[] args)
  {
    int[] arr = {1,1,0,1,0,2,1,2,0};
    sortArray(arr,arr.length);
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  public static void sortArray(int[] a,int n)
  {
    int lo = 0;
    int mid = 0;
    int high = n-1;
    int temp = 0;
    while(mid<=high){
      switch(a[mid]){
        case 0:temp = a[mid];
               a[mid] = a[lo];
               a[lo] = temp;
               mid++;
               lo++;
               break;
        case 1:mid++;
               break;
        case 2:temp = a[mid];
               a[mid] = a[high];
               a[high] = temp;
               high--;
               break;
      }
    }
  }
}
