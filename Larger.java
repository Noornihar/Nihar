import java.io.*;
import java.util.*;
public class Larger
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.println("a is greater");
}
else if(b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("cis greater");
}
}
}
