import java.io.*;
import java.util.*;
public class Vowels {
  
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     String s=sc.nextLine();
     String str1="";
    char p[]=s.toCharArray();
    int l=s.length();
    char[] str=new char[l];
    for(int i=0;i<l;i++){
        if(p[i]=='a'||p[i]=='e'||p[i]=='i'||p[i]=='o'||p[i]=='u'||p[i]=='A'||p[i]=='E'||p[i]=='I'||p[i]=='O'||p[i]=='U'){
          System.out.print(p[i]);
        }
        else{
          str1=p[i]+str1;
        }
    }
    System.out.print(str1);
      
  }
}    
