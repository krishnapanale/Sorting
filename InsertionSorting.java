package dsa;

public class InsertionSorting {
	
	public static void insertionsort(int[] arr) {
		int n=arr.length;
		
		
		for(int i=1; i<n; i++ ) {
			int j=i-1;
			int key = arr[i]; 
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}			
			arr[j+1]=key;	
			
		}		
	}
	
	public static void main(String[] args) {
		int[] arr = {23,12,2,5,89,566,3,66,88,7,90};
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		
		insertionsort(arr);
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}

	
}
