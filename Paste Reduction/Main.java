import java.util.*;

public class Main{
  public static void main(String[] args){
    Main ob = new Main();
    Scanner sn = new Scanner(System.in);
    String para = sn.nextLine();
    String fault = sn.nextLine();
    int ans = ob.max_paste(para,fault);
    System.out.println(ans);
  }


  public int max_paste(String para,String fault)
  {
    HashMap<Character,Integer> map = new HashMap<>();

    for(int i=0;i<fault.length();++i)
    {
      map.put(fault.charAt(i),0);
    }

    for(int i=0;i<para.length();++i)
    {
      if(map.containsKey(para.charAt(i))){
           map.put(para.charAt(i), map.get(para.charAt(i)) + 1);}
         }

    int max_so_far = 0;
    int flag = 0;
    for(char key: map.keySet())
         {
           if(map.get(key) > max_so_far)
           {
             max_so_far = map.get(key);
           }
           else if(map.get(key) == max_so_far)
           {
             flag ++;
           }
         }

   	return max_so_far+flag;
         }
  }
