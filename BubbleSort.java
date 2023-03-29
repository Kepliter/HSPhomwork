public class BubbleSort {
	public static void main(String[] Args) {
		int[] arr = {12,-3,29,17,324,100,2,78,56,-100};
		int temp = 0;
		int len = arr.length;
		
		for (int i = 0; i < len - 1 ; i++) {
			for (int j = 0; j < len - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int j = 0; j < len; j++) {
			System.out.print (arr[j] + "\t");
		}	
	}
}