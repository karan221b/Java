import java.util.Scanner;

class Xor{
public static void main(String []args)
{
char z,a;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Character: ");
z = sc.next().charAt(0);
System.out.print("Enter Character: ");
a = sc.next().charAt(0);

System.out.println(Integer.toBinaryString(a^z));
}
}
