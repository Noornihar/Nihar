import java.io.*;
import java.util.*;
public class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c=0;
int n=sc.nextLine(0;
b=n;
while(n>0)  
{  
a=n%10;  
n=n/10;  
c=c+(a*a*a);  
}  
if(b==c)  
System.out.println("armstrong number");   
else  
System.out.println("Not armstrong number");   
}
}
