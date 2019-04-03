import java.util.Scanner;
class even
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter No");

int a =s.nextInt();

if(a%2==0)
{
System.out.println("EVEN NUMBER");
}
else
{
System.out.println("ODD NUMBER");
}
}
}