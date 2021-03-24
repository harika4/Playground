import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
        int input=in.nextInt();
        
        int temp, mod, sum = 0;
    
        temp = input;
    
        while(input > 0)
        {
            mod = input % 10;
    
            sum=sum + fact (mod);
    
            input  = input /10;
                    
        }
        if(temp == sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static int fact(int num)
    {
        int fact=1;
    
        for(int i = 1; i <= num; i++)
        {
            fact *= i;
        }
        return fact;
    }
        
}