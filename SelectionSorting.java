package dsa;

public class SelectionSorting {
	
	private static void selectionsorting(int[] arr) {
		
		for(int i =0; i<arr.length;i++) {
			int min = i;
			
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
					
				}
			}
			
			if(min != i) {
				int temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {23,12,2,5,89,566,3,66,88,7,90};
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		
		selectionsorting(arr);
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}

	
}
