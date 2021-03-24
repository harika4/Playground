import java.util.Scanner;
class Main
{
  public static int result_function(int num)
  {
    int square=(num*num);
    return square;
  }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      int result1=result_function(num1);
      System.out.println(result1);
	} 
}