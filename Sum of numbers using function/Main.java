import java.util.Scanner;
class Main{
  public static int result_function(int num)
  {
    int sum=0;
    while(num>0)
    {
      sum=sum+num;
    num=num-1;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      
        int result=result_function(num1);
       
      System.out.println(result);

	}
}