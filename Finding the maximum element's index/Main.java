import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner in=new Scanner(System.in);
    int arr_size=in.nextInt();
    int arr[]=new int[arr_size];
    int max_idx;
   for(int index=0;index<=arr_size-1;index++)
   {
     arr[index]=in.nextInt();
   }
    if(arr[0]>arr[1])
    max_idx=0;
    else
      max_idx=1;
   for(int index=2;index<=arr_size-1;index++)
   {
     if(arr[max_idx]<arr[index])
       max_idx=index;
   }
    System.out.println(max_idx);
     
    
  }
}