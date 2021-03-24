import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      if(n>10000)
      {
        int x=n/10000;
        int y=n%10;
        int sum=x+y;
        System.out.println(sum);
	}
      else if(n>1000&&n<10000)
      {
        int x=n/1000;
        int y=n%10;
        int sum=x+y;
        System.out.println(sum);
}
    }
}