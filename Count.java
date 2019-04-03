import java.util.Scanner;

class Count{
	public static void main(String []args){
		int pos=0, neg=0, eve=0, odd=0, num;
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<11;i++){
			System.out.print("Enter Number "+i+": ");
			num = sc.nextInt();
			if(num>0){
				pos += 1;
			}
			else if(num<0){
				neg += 1;
			}
			if(num%2==0){
				eve += 1;
			}
			else{
				odd += 1;
			}
		}
		System.out.println("Count of Positive numbers: "+pos+"\nCount of Negative numbers: "+neg+"\nCount of Even numbers: "+eve+"\nCount of Odd numbers: "+odd);
	}


} 