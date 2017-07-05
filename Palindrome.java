import java.io.*;
import java.util.*;
public class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r,a=0,b,n;
n=sc.nextInt();
b=n;
while(n>0)
{
r=n%10;
a=(a*10)+r;
n=n/10;
}
if(b==a)
{
System.out.println("palindrome");
}
else
{
system.out.println("not palindrome");
}
}}
