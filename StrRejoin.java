import java.io.*;
import java.util.*;
class StrRejoin
{
public static void main(String args[])
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the string:");
s=in.nextLine();
String sub=s.substring(0,3);
System.out.println(sub+s+sub);
}
}

