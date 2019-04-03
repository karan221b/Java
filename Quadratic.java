import java.util.Scanner;
class Quadratic{
	public static void main(String []args){
		int a, b, c;
		float root1, root2;
		char s1, s2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of coefficient of x^2: ");
		a = sc.nextInt();
		System.out.print("Enter value of coefficient of x: ");
		b = sc.nextInt();
		System.out.print("Enter value of constant: ");
		c = sc.nextInt();
		
		if(b<0){s1 = '-';}else{s1 = '+';}
		if(c<0){s2 = '-';}else{s2 = '+';}
		
		System.out.println("Quadratic Equation is "+a+"(x^2)"+s1+b+"x"+s2+c);
		
		root1 = (float)((-b) + (b*b - 4*a*c)*0.5)/(2*a);
		root2 = (float)((-b) - (b*b - 4*a*c)*0.5)/(2*a);
		System.out.println("Roots of Quadratic Equation are "+root1+" and "+root2);
	}
	
}