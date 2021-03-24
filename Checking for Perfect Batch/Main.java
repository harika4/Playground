import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
   for(int index=0;index<=arr_size-1;index++)
   {
     arr[index]=in.nextInt();
   }
    batch_sum(arr_size,arr);
  }
    public static void batch_sum(int arr_size,int arr[])
    {
      int b_sum=arr[0]+arr[1]+arr[2];
      boolean is_matched=true;
      for(int index=3;index<=arr_size-1;index=index+3)
      {
        int curr_sum=arr[index]+arr[index+1]+arr[index+2];
        if(b_sum!=curr_sum)
        {
          is_matched=false;
          break;
        }
      }
      if(is_matched==true)
      System.out.println("Perfect Batch");
      else
      System.out.println("Not a Perfect Batch");
        
     
  }
}