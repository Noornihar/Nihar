import java.io.*;
import java.util.*;
import java.lang.*;
public class Power
{
  public static void main(String args[])
  {
    double n;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    n= Math.pow(a,b);
    System.out.println(Math.round(n));
  }
}
