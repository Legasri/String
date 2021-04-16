import java.io.*;
import java.util.Scanner;
class Strjoin
{
public static void main(String args[])
{
String s1,s2;
Scanner in=new Scanner(System.in);
System.out.println("Enter the string1:");
s1=in.nextLine();
System.out.println("Enter the string2:");
s2=in.nextLine();
if(s1.length()>s2.length())
System.out.println(s2+s1+s2);
else
System.out.println(s1+s2+s1);
}
}