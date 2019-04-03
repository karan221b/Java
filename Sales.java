import java.util.Scanner;

class Sales{
	public static void main(String []args){
		double comm=0;
		int sales;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Sales: ");
		sales = sc.nextInt();
		
		if(sales>5000){
			if(sales>15000){
				if(sales>25000){
					if(sales>35000){
						comm = 0.15*sales;
					}
					else{
						comm = 0.07*sales;
					}
				}
				else{
					comm = 0.05*sales;
				}
			}
			else{
				comm = 0;
			}
		}
		System.out.println("Commission is "+comm);
	}
}