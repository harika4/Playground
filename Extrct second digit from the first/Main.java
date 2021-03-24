import java.util.Scanner;
public class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    if(n>10000)
    {
      int x=(n/1000)%10;
      System.out.println(x);
    }
    else if(n>10&&n<10000)
    {
      int x=n%10;
      System.out.println(x);
    }
  }
}