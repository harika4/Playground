import java.util.Scanner;
public class Main{
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int i,sum=0;
      int num=in.nextInt();
      
 
      for(i=1;i<=num;i++)
      {
    
      sum = sum+i;
      }
      System.out.println(sum);
      
      
	}
}