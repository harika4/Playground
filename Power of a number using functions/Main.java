import java.util.Scanner;
public class Main
{
public static int result_function(int base,int exponential)
{
  int power=1;
while(exponential>=1)
{
  power=power*base;
  exponential--;
}
  return power;
}
public static void main(String agrs[])
{
  Scanner in=new Scanner(System.in);
  int num1=in.nextInt();
  int num2=in.nextInt();
  int result=result_function(num1,num2);
  System.out.println(result);
}
}