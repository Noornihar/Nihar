import java.io.*;
 import java.util.*;
 import java.lang.*;
 public class Prime
{
public static void main(String args[]) throws ArithmeticException
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
count++;
break;
}
}
if((count==0) )
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}
