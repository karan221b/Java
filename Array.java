import java.util.Scanner;
class Large{
	static int[] sort(int arr[],int arrnum){
		int temp;	
		for(int i=arrnum-1;i>0;i--){
			for(int x=0;x<i;x++){
				if(arr[x]>arr[x+1]){
					temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		
		return arr;
	}
}

class Array extends Large{
	public static void main(String []args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Large l = new Large();
		l.sort(arr,n);
		System.out.println("3rd Largest element is: "+arr[n-3]);
	}	
	
}