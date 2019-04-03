import java.io.*;
import java.net.*;
import java.util.Scanner;
//Two Way
public class MyServer2{
	public static void main(String[]args)throws Exception{
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Server started");
			ServerSocket ss = new ServerSocket(6666);
			System.out.println("Server is waiting for client request");
			Socket s = ss.accept();
			OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
			InputStream in = s.getInputStream();
			PrintWriter out = new PrintWriter(os, true);
			BufferedReader br= new BufferedReader(new InputStreamReader(in));
			System.out.println("client connected");
			while(true){
				read(br);
				write(sc, out);
			}
		}
		catch(Exception e){}
	}
	static void read(BufferedReader br) throws Exception{
		String str= br.readLine();
		System.out.println("Client message: " + str);
	}
	
	static void write(Scanner sc, PrintWriter out) throws Exception{
		System.out.print("Send Message: ");
		out.write(sc.next());
		out.flush();
	}
	
}