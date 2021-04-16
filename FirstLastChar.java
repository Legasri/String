import java.io.*;
import java.util.Scanner;
class FirstLastChar
{
public static void main(String args[])
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the String:");
s=in.nextLine();
if(s.length()==0)
System.out.println("##");
else
System.out.println(s.charAt(0)+s.substring(s.length()-1));
}
}