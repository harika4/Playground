import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(int i=1;i<=num;i++)
      {
        for(int j=num;j>=1;j--)
        {
          if(i>=j)
            System.out.print("*");
          else
               System.out.print(" "); 
        }
        for(int j=1;j<i;j++)
        {
           System.out.print("*");
        }
         System.out.print("\n");
      }
	}
}