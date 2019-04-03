import java.util.Scanner;
class account{
public static void main(String [] args)
{
Scanner ac=new Scanner(System.in);
System.out.print("Enter Your Name:");
String a=ac.next();
System.out.print("Enter your Balance amount:");
int b=ac.nextInt();
System.out.println("Enter Your Choice \n 1.Withdraw: \n 2.Deposit");
int c=ac.nextInt();
if (c==1)
{
System.out.print("Enter the Amount of Withdrawal:");
int d=ac.nextInt();
int f=b-d;
if(d>b)
	{
	System.out.print("You cannot withdraw amount more than "+b);
	}
	else
		{System.out.print("Your Transaction has been processed\n Balance Amount:"+f);
		}
}
else if(c==2)
	{
	System.out.print("Enter the amount you want to deposit:");
int e=ac.nextInt();
int g=b+e;
	System.out.print("Your transaction has been processed\n Your updated Account Balance is:"+g);
	}
}
}