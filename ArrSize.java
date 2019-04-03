import java.util.Scanner;
class ArrSize{
	public static void main(String []args){
		int arrsize, min, max;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of Array: ");
		arrsize = sc.nextInt();
		int arr[] = new int[arrsize];
		
		System.out.println("Enter "+arrsize+" integers for array:");
		for(int i=0;i<arrsize;i++){
			arr[i]=sc.nextInt();
		}
		
		min = arr[0];
		max = arr[0];
		for(int i=1;i<arrsize;i++){
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Maximum number is "+max+"\nMinimum Number is "+min);
	}

}