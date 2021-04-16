import java.io.*;
import java.util.*;
class Str3print
{
public static void main(String args[])
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the string:");
s=in.nextLine();
if(s.length()>=3)
System.out.println(s.substring(0,3));
else if(s.length()==1)
System.out.println(s.substring(0)+"##");
else if(s.length()==2)
System.out.println(s.substring(0)+"#");
else
System.out.println("###");
}
}