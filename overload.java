import java.util.Scanner;

class overload{
	public static void main(String []args){
		int a, b;
		float arrea;
		String side;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Radius of Circle: ");
		a = sc.nextInt();
		System.out.println("Area of circle is "+area(a)+"\n");
		System.out.print("Enter Length of Rectangle: ");
		a = sc.nextInt();
		System.out.print("Enter Breadth of Rectangle: ");
		b = sc.nextInt();
		System.out.println("Area of rectangle is "+area(a,b)+"\n");
		System.out.print("Enter Length of side of Square: ");
		side = sc.next();
		System.out.println("Area of square is "+area(side));
	}
	
	static float area(int r){
		return (float)3.142*r*r;
	}
	
	static int area(int l, int b){
		return l*b;
	}
	
	static int area(String side){
		int a = Integer.parseInt(side);
		return a*a;
	}
}