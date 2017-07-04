# Nihar
import java.io.*;
import java.util.*;
public class Vowel
{
  public static void main(String args[]) throws IOException
  {
    char a;  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    a=br.readLine().charAt(0);
    if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u')||(a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U'))
    {
      System.out.println("vowel");
    }
    else
    {
      System.out.println("consonant");
    }
  }
}
