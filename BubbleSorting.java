package dsa;

public class BubbleSorting {
	
	private static void bubblesorting(int[] arr) {
		int n = arr.length;
		
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=0; j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=count+1;
					
					for(int ele:arr) {
						System.out.print(ele+" ");
					}
					System.out.println();
				}
			}
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {23,12,2,5,89,566,3,66,88,7,90};
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
		
		System.out.println();
		
		bubblesorting(arr);
		
		for(int ele:arr) {
			System.out.print(ele+" ");
		}
	}

	
}
