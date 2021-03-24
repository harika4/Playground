import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      for(int n1=1;n1<=num;n1++)
      {
        if(num%n1==0)
          System.out.println(n1);
      }
	}
}