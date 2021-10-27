package sorting;

public class IntertionSort {
	
	public static int[] inSort(int[] arr) {
		int n = arr.length;
		for(int i = 1 ; i < n ; i++) {
			int j = i - 1;
			int temp = arr[i];
			while(j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		
		return arr;
	} 
	
	public static void main(String[] args) {
		int arr[] = {6 , 4 , 3 , 5 , 2};
		arr = inSort(arr);
		
		for(int elem : arr) {
			System.out.print(elem + " ");
		}
	}

}
