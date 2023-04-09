public class TwoDimensionalArray04{
	public static void main(String[]Args) {
		//二维数组中的数组中的元素个数不同时
		//列数不确定
		/*输出：
		 * 1
		 * 2 2
		 * 3 3 3
		 */
		//创建一个二维数组，只确定二维数组中数组的个数，但是数组中元素个数不一样
		int[][] arr = new int [5][];
		//遍历二维数组
		for(int i = 0; i < arr.length; i++) {
			//给二维数组中的数组开辟地址
			arr[i] = new int [i + 1];
			//遍历二维数组中的数组，并赋值
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i+1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}