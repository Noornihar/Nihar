import java.io.*;
 import java.util.*;
 import java.lang.*;
 public class Prim
{
  public static void main(String args[]) throws ArithmeticException
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int count=0;
    for(int i=a;i<b;i++)
    {
      for(int j=2;j<i;j++)
      {
  
        if(i%j==0)
      {
          count=0;
        break;
      }
  
      else
      {
          
        count=1;
        }
        }
    if(count==1)
    {
      
      System.out.println(i);
      }
     }
  }
}
