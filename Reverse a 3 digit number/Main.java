import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int result=((num%10)*100)+(((num%100)/10)*10)+(num/100);
    System.out.println(result);
  }
}