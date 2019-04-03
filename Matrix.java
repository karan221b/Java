import java.util.Scanner;

class Matrix{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in); 
		int a[][] = new int[3][3], b[][] = new int[3][3],add[][] = new int[3][3];
		System.out.println("Enter 9 values for 1st 3x3 matrix:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 9 values for 2nd 2x2 matrix:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nAddition of both the matrices are:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				add[i][j] = a[i][j] + b[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	
}