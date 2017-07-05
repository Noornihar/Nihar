import java.io.*;
import java.util.*;
public class Armstrongrange
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);  
    int n, count = 0, a, b, n1,n2, sum = 0;
    //n=sc.nextInt();
    System.out.println("Enter the starting number");
    n1=sc.nextInt();
    System.out.println("Enter the ending number");
    n2=sc.nextInt();
    
    for(int i = n1; i <= n2; i++)
    {
      n = i;
      while(n > 0)
      {
        b = n % 10;
        sum = sum + (b * b * b);
        n = n / 10;
      }
      if(sum == i)
      {
        System.out.print(i+" ");
      }
      sum = 0;
    }
  }
}
