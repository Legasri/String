import java.io.*;
import java.util.*;
class RemoveAndJoin
{
public static void main(String args[])
{
String s1,s2;
Scanner in=new Scanner(System.in);
System.out.println("Enter the String1:");
s1=in.nextLine();
System.out.println("Enter the String2:");
s2=in.nextLine();
String Str1=s1.substring(1);
String Str2=s2.substring(1);
System.out.println(Str1+Str2);
}
}