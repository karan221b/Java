import java.io.*;
import java.net.*;

public class Myserver
{
public static void main(String args[]) throws  Exception
{
try
{
System.out.println("Server Started");
ServerSocket ss=new ServerSocket(6666);
System.out.println("server is waiting for client request");
Socket s=ss.accept();
System.out.println("client connected");

BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

String str=br.readLine();

System.out.println("client Msg="+str);
ss.close();
}

catch(Exception e)
{
System.out.println(e);
}
}}