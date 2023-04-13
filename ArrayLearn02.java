public class ArrayLearn02{
	public static void main(String[]Args) {
		//冒泡排序
		int[] arr = {12, -1, 8, 3, 88, 63, -19};
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len - 1; i++) {
			for(int j = 0; j < len - 1 -i; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}