import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n>10000)
    {
      int x=(n/10000);
      int y=(n/1000)%10;
      int z=(n/100)%10;
      int a=(n/10)%10;
      int b =(n%10);
      int sum=x+y+z+a+b;
      System.out.println(sum);
     
    }
    else if(n>100&&n<10000)
    {
      int x=n%10;
      int y=n/100;
      int sum=x+y;
      System.out.println(sum);
    }
  }
}