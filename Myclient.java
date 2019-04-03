import java.io.*;
import java.net.*;

public class Myclient
{
public static void main(String args[]) throws  Exception
{
try
{
Socket s=new Socket("192.168.1.105",6666);
System.out.println("Server connected");

String str="hello";

OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());

PrintWriter out= new PrintWriter(os);

out.write(str);
out.flush();
s.close();
}

catch(Exception e)
{
System.out.println(e);
}
}
}