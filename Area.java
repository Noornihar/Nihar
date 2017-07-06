import java.io.*;
import java.util.*;
 class areas
{
  public void circle(int r)
  {
    double pi=3.14;
    double cir=pi*r*r;
    System.out.println(cir);
  }
  public void rectangle(int l,int b)
  {
    double rect=l*b;
    System.out.println(rect);
  }
  public void triangle(int l,int b)
  {
    double f=0.5;
    double tri=0.5*l*b;
    System.out.println(tri);
  }
    }
  public class Area
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int l=sc.nextInt();
      int b=sc.nextInt();
      areas a=new areas();
      a.circle(r);
      a.rectangle(l,b);
      a.triangle(l,b);
    }
  }
  

