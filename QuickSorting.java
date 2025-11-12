package dsa;

public class QuickSorting {
	
	public static void quicksorting(int[] arr, int low, int high) {
		
		if(low<high) {
			int pivotindex = partition(arr,low,high);
				
			quicksorting(arr,low,pivotindex-1);
			quicksorting(arr,pivotindex+1,high);
		}
	}
	
	public static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i=low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			
		}
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high]=temp;
		
		return i+1;
	}

	public static void main(String[] args) {
		int[] arr = {9,8,7,6,5,34,566,2,45,1,67};
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		
		quicksorting(arr,0,arr.length-1);
		
		System.out.println();
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
		
		
	}

	
}
